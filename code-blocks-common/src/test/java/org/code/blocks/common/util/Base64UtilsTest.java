package org.code.blocks.common.util;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.constant.CommonConstant;
import org.junit.Assert;
import org.junit.Test;

/**
 * base64测试类
 * @author darwindu
 * @date 2019/4/11
 **/
@Slf4j
public class Base64UtilsTest {


    @Test
    public void demo() throws Exception {

        String s = "hello world! 您好！";
        //base64编码
        String base64 = Base64Utils.encode(s);
        log.info("base64:{}", base64);

        //base64解码
        String base64_ = Base64Utils.decodeString(base64);
        log.info("base64_:{}", base64_);

        Assert.assertEquals(s, base64_);
    }

    @Test
    public void demo1() throws Exception {

        String s = "hello world! 您好！";
        //base64编码
        String base64 = Base64Utils.encode(s.getBytes(CommonConstant.UTF_8));
        log.info("base64:{}", base64);

        //base64解码
        byte[] bs = Base64Utils.decode(base64);
        String base64_ = new String(bs, CommonConstant.UTF_8);
        log.info("base64_:{}", base64_);

        Assert.assertEquals(s, base64_);
    }

}
