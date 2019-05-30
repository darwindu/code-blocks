package org.code.blocks.common.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/5/28
 **/
@Slf4j
public class PropertyUtilsTest {

    @Test
    public void getProperty() {

        String hello = PropertyUtils.getProperty("code-blocks.hello");
        log.info("hello:{}", hello);
        Assert.assertNotNull(hello);
    }
}
