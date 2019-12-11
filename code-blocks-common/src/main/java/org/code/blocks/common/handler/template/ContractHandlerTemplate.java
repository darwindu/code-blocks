package org.code.blocks.common.handler.template;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.exception.BaseException;
import org.code.blocks.common.exception.ValidateException;
import org.code.blocks.common.handler.ContractHandler;
import org.code.blocks.common.protocol.enums.CommonErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.common.util.JsonUtils;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
@Slf4j
public class ContractHandlerTemplate {

    public static <T> ResponseData<T> execute(ContractHandler<ResponseData<T>> contractHandler, String methodName, Object... paramObjects) {

        try {
            return contractHandler.execute();
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
