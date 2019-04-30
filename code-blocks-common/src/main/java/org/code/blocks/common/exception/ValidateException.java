package org.code.blocks.common.exception;

import org.code.blocks.common.protocol.enums.CommonErrorCode;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
public class ValidateException extends BaseException {

    public ValidateException(Throwable cause) {
        super(cause);
    }

    public ValidateException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public ValidateException(String errorMessage) {
        super(errorMessage);
    }

    public ValidateException(Integer errorCode, String errorMessage, Throwable cause) {
        super(errorCode, errorMessage, cause);
    }

    public ValidateException(CommonErrorCode commonErrorCode,
        Throwable cause) {
        super(commonErrorCode, cause);
    }

    public ValidateException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public ValidateException(CommonErrorCode commonErrorCode) {
        super(commonErrorCode);
    }
}
