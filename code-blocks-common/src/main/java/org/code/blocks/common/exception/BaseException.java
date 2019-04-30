package org.code.blocks.common.exception;

import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.protocol.enums.ErrorCode;

/**
 * 异常基类
 * @author darwindu
 * @date 2019/3/4
 **/
public class BaseException extends RuntimeException {

    private Integer errorCode;
    private String errorMessage;

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public BaseException(String errorMessage) {
        super(errorMessage);
    }

    /**
     * constructor.
     * @param cause exception object
     * @param errorCode exception error code.
     * @param errorMessage exception error messave.
     */
    public BaseException(Integer errorCode, String errorMessage, Throwable cause) {
        super(getMsg(errorCode, errorMessage), cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * constructor.
     * @param errorCode exception enum errorcode
     * @param cause exception object
     */
    public BaseException(ErrorCode errorCode, Throwable cause) {
        super(getMsg(errorCode), cause);
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorCode.getCodeDesc();
    }

    /**
     * constructor.
     * @param errorCode exception error code
     * @param errorMessage exception error messave
     */
    public BaseException(Integer errorCode, String errorMessage) {
        super(getMsg(errorCode, errorMessage));
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * constructor.
     * @param errorCode exception enum errorcode
     */
    public BaseException(ErrorCode errorCode) {
        super(getMsg(errorCode));
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorCode.getCodeDesc();
    }


    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private static String getMsg(ErrorCode errorCode) {
        return getMsg(errorCode.getCode(), errorCode.getCodeDesc());
    }

    private static String getMsg(Integer errorCode, String errorMessage) {

        return new StringBuffer(errorCode == null ? CommonConstant.EMPTY : errorCode.toString())
            .append(CommonConstant.SYMBOL_VERTICAL)
            .append(errorMessage == null ? CommonConstant.EMPTY : errorMessage).toString();
    }
}
