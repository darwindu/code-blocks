package org.code.blocks.common.exception;

import org.code.blocks.common.protocol.enums.ErrorCode;

/**
 * @author darwindu
 * @date 2020/11/20
 **/
public class ComponentException extends BaseException {

    public ComponentException(Throwable cause) {
        super(cause);
    }

    public ComponentException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public ComponentException(String errorMessage) {
        super(errorMessage);
    }

    public ComponentException(Integer errorCode, String errorMessage, Throwable cause) {
        super(errorCode, errorMessage, cause);
    }

    public ComponentException(ErrorCode errorCode,
        Throwable cause) {
        super(errorCode, cause);
    }

    public ComponentException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public ComponentException(ErrorCode errorCode) {
        super(errorCode);
    }
}
