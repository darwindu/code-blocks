package org.code.blocks.common.util.encrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.code.blocks.common.exception.BaseException;


/**
 * 加密解密共用类
 * @author darwindu
 * @date 2019/4/11
 **/
public class EncrypttUtils {

    /**
     * 加密
     * @param algorithm
     * @param source
     * @param key
     * @return
     */
    public static byte[] encrypt(String algorithm, byte[] source, Key key){

        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(source);
        } catch (NoSuchAlgorithmException
            | NoSuchPaddingException
            | InvalidKeyException
            | IllegalBlockSizeException
            | BadPaddingException e) {
            throw new BaseException(e);
        }
    }

    /**
     * AES解密
     * @param algorithm
     * @param source
     * @param key
     * @return
     */
    public static byte[] decrypt(String algorithm, byte[] source, Key key) {

        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(source);
        } catch (NoSuchAlgorithmException
            | NoSuchPaddingException
            | InvalidKeyException
            | IllegalBlockSizeException
            | BadPaddingException e) {
            throw new BaseException(e);
        }
    }
}
