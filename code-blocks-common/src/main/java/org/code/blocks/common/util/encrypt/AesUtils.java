package org.code.blocks.common.util.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.exception.BaseException;
import org.code.blocks.common.util.Base64Utils;

/**
 * 对称加密AES算法组件
 *
 * @author darwindu
 * @date 2019/4/11
 */
public class AesUtils extends EncrypttUtils {

    /**加密算法**/
    private static final String ALGORITHM_AES = "AES";
    /**AES的密钥长度**/
    private static final Integer SECRET_KEY_SIZE = 128;

    private static final KeyGenerator keyGenerator;
    static {
        try {
            keyGenerator = KeyGenerator.getInstance(ALGORITHM_AES);
            keyGenerator.init(SECRET_KEY_SIZE);
        } catch (NoSuchAlgorithmException e) {
            throw new BaseException(e);
        }
    }

    /**
     * 生成对称密钥
     * @return SecretKey
     */
    public static SecretKey generateKey() {
        return keyGenerator.generateKey();
    }

    /**
     * 生成Base64对称密钥
     * @return String
     */
    public static String generateBase64Key() {

        SecretKey secretKey = keyGenerator.generateKey();
        return Base64Utils.encode(secretKey.getEncoded());
    }

    /**
     * 加载base64对称密钥
     * @param base64Key
     * @return SecretKey
     */
    public static SecretKey loadKey(String base64Key) {
        return new SecretKeySpec(Base64Utils.decode(base64Key), ALGORITHM_AES);
    }

    /**
     * AES加密
     * @param content 原文本
     * @param key 对称密钥
     * @return
     */
    public static byte[] encrypt(byte[] content, SecretKey key){
        return encrypt(ALGORITHM_AES, content, key);
    }

    /**
     * AES加密
     * @param content 原文本
     * @param base64Key base64对称密钥
     * @return String 返回加密后的base64
     */
    public static String encrypt(String content, String base64Key){
        try {
            return Base64Utils.encode(
                encrypt(content.getBytes(CommonConstant.UTF_8), loadKey(base64Key))
            );
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

    /**
     * AES解密
     * @param content 加密文本
     * @param key 对称密钥
     * @return
     */
    public static byte[] decrypt(byte[] content, SecretKey key) {
        return decrypt(ALGORITHM_AES, content, key);
    }

    /**
     * AES解密
     * @param base64Content 加密文本
     * @param base64Key base64对称密钥
     * @return String
     */
    public static String decrypt(String base64Content, String base64Key) {
        try {
            return new String(
                decrypt(Base64Utils.decode(base64Content), loadKey(base64Key)),
                CommonConstant.UTF_8
            );
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

}
