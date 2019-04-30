package org.code.blocks.common.util.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.exception.BaseException;
import org.code.blocks.common.util.Base64Utils;

/**
 * 非对称加密算法RSA算法组件
 *
 * @author darwindu
 * @date 2019/4/11
 */
public class RsaUtils extends EncrypttUtils {

    /**
     * 加密算法
     **/
    private static final String ALGORITHM_RSA = "RSA";

    /**
     * 加密后密文长度 密钥长度，DH算法的默认密钥长度是1024 密钥长度必须是64的倍数，在512到65536位之间
     * 512可加密53个字节
     * 1024可加密117个字节
     */
    private static final int KEY_SIZE = 512;

    /**
     * 生成公私钥对
     */
    public static KeyPair generateKeyPair() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM_RSA);
            keyPairGenerator.initialize(KEY_SIZE);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new BaseException(e);
        }
    }

    /**
     * 生成base64编码后的公钥
     *
     * @param keyPair 公私钥对
     */
    public static String generatePublicKey(KeyPair keyPair) {
        PublicKey publicKey = keyPair.getPublic();
        byte[] bytes = publicKey.getEncoded();
        return Base64Utils.encode(bytes);
    }

    /**
     * 生成base64编码后的私钥
     *
     * @param keyPair 公私钥对
     */
    public static String generatePrivateKey(KeyPair keyPair) {
        PrivateKey privateKey = keyPair.getPrivate();
        byte[] bytes = privateKey.getEncoded();
        return Base64Utils.encode(bytes);
    }

    /**
     * base64解码后的公钥
     *
     * @param publicKeyBase64 base64编码后的公钥
     */
    public static PublicKey publicKeyBase642PublicKey(String publicKeyBase64) {
        try {
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64Utils.decode(publicKeyBase64));
            return KeyFactory.getInstance(ALGORITHM_RSA).generatePublic(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new BaseException(e);
        }

    }

    /**
     * base64解码后的私钥
     *
     * @param privateKeyBase64 base64编码后的私钥
     */
    public static PrivateKey privateKeyBase642PrivateKey(String privateKeyBase64) {

        try {
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64Utils.decode(privateKeyBase64));
            return KeyFactory.getInstance(ALGORITHM_RSA).generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new BaseException(e);
        }
    }

    /**
     * 公钥加密
     *
     * @param content 原文本
     * @param publicKey 公钥
     */
    public static byte[] encrypt(byte[] content, PublicKey publicKey) {
        return encrypt(ALGORITHM_RSA, content, publicKey);
    }

    /**
     * 公钥加密
     *
     * @param content 原文本
     * @param publicKey 公钥
     */
    public static String encrypt(String content, String publicKey)  {

        try {
            byte[] encryptByte = encrypt(
                content.getBytes(CommonConstant.UTF_8),
                publicKeyBase642PublicKey(publicKey)
            );
            return Base64Utils.encode(encryptByte);
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

    /**
     * 私钥解密
     *
     * @param content 加密原文
     * @param privateKey 私钥
     */
    public static byte[] decrypt(byte[] content, PrivateKey privateKey) {
        return decrypt(ALGORITHM_RSA, content, privateKey);
    }

    /**
     * 私钥解密
     *
     * @param base64Content 加密原文
     * @param privateKey 私钥
     */
    public static String decrypt(String base64Content, String privateKey) {

        try {
            byte[] decryptByte = decrypt(
                Base64Utils.decode(base64Content),
                privateKeyBase642PrivateKey(privateKey)
            );
            return new String(decryptByte, CommonConstant.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

}
