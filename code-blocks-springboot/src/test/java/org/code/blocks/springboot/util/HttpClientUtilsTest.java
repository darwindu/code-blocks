package org.code.blocks.springboot.util;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.springboot.BaseTest;
import org.code.blocks.springboot.config.InitConfig;
import org.code.blocks.springboot.runner.CommonRunner;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/5/16
 **/
@Slf4j
public class HttpClientUtilsTest extends BaseTest {

    @Test
    public void hi() {
        log.info("httpRequestTimeOut: {}", HttpClientUtils.httpRequestTimeOut_);
    }
}
