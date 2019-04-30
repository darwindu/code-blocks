package org.code.blocks.common.util.encrypt;

import java.security.KeyPair;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * 非对称密钥加密解密算法测试类
 * @author darwindu
 * @date 2019/4/11
 **/
@Slf4j
public class RsaUtilsTest {

    /**
     * 非对称密钥对对称密钥进行加密解密
     */
    @Test
    public void demo() {

        //生成对称base64密钥
        String aesBase64Key = AesUtils.generateBase64Key();
        log.info("aesBase64Key: {}, aesBase64Key长度: {}", aesBase64Key, aesBase64Key.length());

        //生成非对称密钥
        KeyPair keyPair = RsaUtils.generateKeyPair();
        //生成非对称密钥-base64公钥
        String base64PublicKey = RsaUtils.generatePublicKey(keyPair);
        log.info("base64PublicKey: {}, base64PublicKey长度: {}", base64PublicKey, base64PublicKey.length());
        //生成非对称密钥-base64私钥
        String base64PrivateKey = RsaUtils.generatePrivateKey(keyPair);
        log.info("base64PrivateKey: {}", base64PrivateKey);

        //使用base64公钥对【对称base64密钥】进行加密
        String encryptContent = RsaUtils.encrypt(aesBase64Key, base64PublicKey);
        log.info("encryptContent: {}", encryptContent);
        //使用base64私钥对【密文】进行解密
        String decryptContent = RsaUtils.decrypt(encryptContent, base64PrivateKey);
        log.info("decryptContent: {}", decryptContent);

        Assert.assertEquals(aesBase64Key, decryptContent);
    }

}
