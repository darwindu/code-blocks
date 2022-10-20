package org.code.blocks.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.errorcode.ErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.common.util.JsonUtils;
import org.code.blocks.spring.BaseTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
@Slf4j
public class HelloWorldSpringServiceTest extends BaseTest {

    @Test
    public void say() {

        log.info("port: {}", listenPort);
        ResponseData<String> responseData = helloWorldSpringService.say();
        log.info("responseData: {}", JsonUtils.objToJson(responseData));
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), responseData.getCode().intValue());
    }

}
