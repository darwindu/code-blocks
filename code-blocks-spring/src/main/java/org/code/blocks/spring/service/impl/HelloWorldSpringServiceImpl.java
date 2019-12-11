package org.code.blocks.spring.service.impl;

import org.code.blocks.common.handler.ContractHandler;
import org.code.blocks.common.handler.template.ContractHandlerTemplate;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.spring.protocol.enums.SpringErrorCode;
import org.code.blocks.spring.service.HelloWorldSpringService;
import org.springframework.stereotype.Service;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
@Service
public class HelloWorldSpringServiceImpl extends BaseServiceImpl implements HelloWorldSpringService {

    @Override
    public ResponseData<String> say() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return ContractHandlerTemplate.execute((ContractHandler) () -> {
            String s = "hello world! I'm code blocks";
            return new ResponseData<>(s, SpringErrorCode.SUCCESS);
        }, methodName);
    }
}
