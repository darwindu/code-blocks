package org.code.blocks.spring.service.impl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.code.blocks.common.handler.impl.ContractHandlerImpl;
import org.code.blocks.common.protocol.enums.ErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.spring.protocol.enums.SpringErrorCode;
import org.code.blocks.spring.service.HelloWorldSpringService;
import org.springframework.stereotype.Service;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
@Service
public class HelloWorldSpringServiceImpl implements HelloWorldSpringService {

    @Override
    public ResponseData<String> say() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return new ResponseData<>().execute(new ContractHandlerImpl<ResponseData<String>>() {
            @Override
            public ResponseData<String> executeContract() {
                String s = "hello world! I'm code blocks";
                return new ResponseData<>(s, SpringErrorCode.SUCCESS);
            }
        }, methodName);
    }
}
