package org.code.blocks.common.util;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.exception.BaseException;

/**
 * base64工具类
 * @author darwindu
 * @date 2019/4/11
 **/
public class Base64Utils {

    private static final Base64.Encoder encoder = Base64.getEncoder();
    private static final Base64.Decoder decoder = Base64.getDecoder();


    /**
     * base64编码
     * @param s 原文本，采用用UTF-8转bytes[]
     * @return
     */
    public static String encode(String s) {
        try {
            return encoder.encodeToString(s.getBytes(CommonConstant.UTF_8));
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

    /**
     * base64编码
     * @param bytes
     * @return
     */
    public static String encode(byte[] bytes) {
        return encoder.encodeToString(bytes);
    }

    /**
     * base64解码, 解码后转换成字符串
     * @param base64
     * @return
     */
    public static String decodeString(String base64) {
        try {
            return new String(decoder.decode(base64), CommonConstant.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

    /**
     * base64解码
     * @param base64
     * @return
     */
    public static byte[] decode(String base64) {
        return decoder.decode(base64);
    }
}
