package org.code.blocks.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.errorcode.ErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.common.util.JsonUtils;
import org.code.blocks.springboot.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author darwindu
 * @date 2019/4/30
 **/
@Slf4j
@Component
public class HelloWorldSpringBootServiceTest extends BaseTest {

    @Autowired
    private HelloWorldSpringBootService helloWorldSpringBootService;

    @Test
    public void say() {

        ResponseData<String> responseData =  helloWorldSpringBootService.say();
        log.info("responseData: {}", JsonUtils.objToJson(responseData));
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), responseData.getCode().intValue());
    }
}
