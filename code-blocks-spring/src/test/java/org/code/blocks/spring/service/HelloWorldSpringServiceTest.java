package org.code.blocks.spring.service;

import java.util.prefs.BackingStoreException;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.enums.CommonErrorCode;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.common.util.JsonUtils;
import org.code.blocks.spring.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Service;

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
        log.info("responseData: {}", JsonUtils.objToJsonStr(responseData));
        Assert.assertEquals(CommonErrorCode.SUCCESS.getCode(), responseData.getErrorCode().intValue());
    }

}
