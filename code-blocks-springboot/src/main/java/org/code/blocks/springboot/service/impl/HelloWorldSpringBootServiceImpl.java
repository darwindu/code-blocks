package org.code.blocks.springboot.service.impl;

import org.code.blocks.common.handler.impl.ContractHandlerImpl;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springboot.enums.SpringBootErrorCode;
import org.code.blocks.springboot.service.HelloWorldSpringBootService;
import org.springframework.stereotype.Service;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
@Service
public class HelloWorldSpringBootServiceImpl implements HelloWorldSpringBootService {

    @Override
    public ResponseData<String> say() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return new ResponseData<>().execute(new ContractHandlerImpl<ResponseData<String>>() {
            @Override
            public ResponseData<String> executeContract() {
                String s = "hello world! I'm code blocks";
                return new ResponseData<>(s, SpringBootErrorCode.SUCCESS);
            }
        }, methodName);
    }
}
