package org.code.blocks.common.protocol.response;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.enums.CommonErrorCode;
import org.code.blocks.common.protocol.enums.ErrorCode;

/**
 * The internal base response result class.
 *
 * @param <T> the generic type
 * @author darwindu
 * @date 2019/3/4
 */
@Data
@Slf4j
public class ResponseData<T> {

    private T result;
    private Integer errorCode = CommonErrorCode.SUCCESS.getCode();
    private String errorMessage = CommonErrorCode.SUCCESS.getCodeDesc();

    /**
     * Instantiates a new response data.
     */
    public ResponseData() {
    }

    /**
     * Instantiates a new response data.
     *
     * @param result the result
     * @param errorCode the return code
     */
    public ResponseData(T result, ErrorCode errorCode) {
        this.result = result;
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorCode.getCodeDesc();
    }

    /**
     * Instantiates a new response data.
     *
     * @param result the result
     * @param errorCode the return code
     * @param errorMessage the return message
     */
    public ResponseData(T result, Integer errorCode, String errorMessage) {
        this.result = result;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
