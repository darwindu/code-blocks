package org.code.blocks.common.service.impl;

import org.code.blocks.common.handler.impl.ContractHandlerImpl;
import org.code.blocks.common.protocol.enums.CommonErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.common.service.HelloWorldService;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public ResponseData<String> say() {

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return new ResponseData<>().execute(new ContractHandlerImpl<ResponseData<String>>() {
            @Override
            public ResponseData<String> executeContract() {

                String s = "hello world! I'm code blocks";
                return new ResponseData<>(s, CommonErrorCode.SUCCESS);
            }
        }, methodName);
    }
}
