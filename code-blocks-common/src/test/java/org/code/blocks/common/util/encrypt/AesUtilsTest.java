package org.code.blocks.common.util.encrypt;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * 对称密钥加密解密算法测试类
 * @author darwindu
 * @date 2019/4/11
 **/
@Slf4j
public class AesUtilsTest {


    /**
     * 对称密钥加密解密
     */
    @Test
    public void demo() {

        String content = "hello world! 您好！";
        //生成base64对称密钥
        String base64Key = AesUtils.generateBase64Key();
        log.info("base64Key: {}, base64Key长度: {}", base64Key, base64Key.length());
        //加密
        String encryptContent = AesUtils.encrypt(content, base64Key);
        log.info("encryptContent: {}, encryptContent长度: {}", encryptContent, encryptContent.length());
        //解密
        String decryptContent = AesUtils.decrypt(encryptContent, base64Key);

        Assert.assertEquals(content, decryptContent);
    }
}
