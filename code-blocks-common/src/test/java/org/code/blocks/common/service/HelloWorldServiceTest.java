package org.code.blocks.common.service;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.errorcode.ErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.common.service.impl.HelloWorldServiceImpl;
import org.code.blocks.common.util.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
@Slf4j
public class HelloWorldServiceTest {

    private HelloWorldService helloWorldService = new HelloWorldServiceImpl();

    @Test
    public void say() {

        ResponseData<String> responseData =  helloWorldService.say();
        log.info("responseData: {}", JsonUtils.objToJson(responseData));
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), responseData.getCode().intValue());
    }
}
