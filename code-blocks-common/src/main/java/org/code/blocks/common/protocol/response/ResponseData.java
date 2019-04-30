package org.code.blocks.common.protocol.response;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.exception.BaseException;
import org.code.blocks.common.exception.ValidateException;
import org.code.blocks.common.handler.ContractHandler;
import org.code.blocks.common.protocol.enums.CommonErrorCode;
import org.code.blocks.common.protocol.enums.ErrorCode;
import org.code.blocks.common.util.JsonUtils;

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

    public ResponseData<T> execute(ContractHandler<ResponseData<T>> contractHandler, String methodName, Object... paramObjects) {

        try {
            return contractHandler.executeContract();
        } catch (InterruptedException | ExecutionException e) {
            log.error(
                "[{}] RunException, paramObjects:{}, errorcode:{}",
                methodName,
                JsonUtils.objToJsonStr(paramObjects),
                CommonErrorCode.CONTRACT_EXECUTE_EXCEPTION.getCode(),
                e
            );
            return new ResponseData<>(null, CommonErrorCode.CONTRACT_EXECUTE_EXCEPTION);
        } catch (TimeoutException e) {
            log.error(
                "[{}] Timeout, paramObjects:{}, errorcode:{}",
                methodName,
                JsonUtils.objToJsonStr(paramObjects),
                CommonErrorCode.CONTRACT_EXECUTE_TIMEOUT.getCode(),
                e
            );
            return new ResponseData<>(null, CommonErrorCode.CONTRACT_EXECUTE_TIMEOUT);
        } catch (ValidateException e) {
            log.error(
                "[{}] RangesException, paramObjects:{}, errorcode:{}",
                methodName,
                JsonUtils.objToJsonStr(paramObjects),
                e.getErrorCode(),
                e
            );
            return new ResponseData<>(null, e.getErrorCode(), e.getErrorMessage());
        } catch (BaseException e) {
            log.error(
                "[{}] BaseException, paramObjects:{}, errorcode:{}",
                methodName,
                JsonUtils.objToJsonStr(paramObjects),
                e.getErrorCode(),
                e
            );
            return new ResponseData<>(null, e.getErrorCode(), e.getErrorMessage());
        } catch (Exception e) {
            log.error(
                "[{}] Exception, paramObjects:{}, errorcode:{}",
                methodName,
                JsonUtils.objToJsonStr(paramObjects),
                CommonErrorCode.UNKNOW_ERROR.getCode(),
                e
            );
            return new ResponseData<>(null, CommonErrorCode.UNKNOW_ERROR);
        }
    }
}
