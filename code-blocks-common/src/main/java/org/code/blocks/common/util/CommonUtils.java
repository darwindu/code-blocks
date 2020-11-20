package org.code.blocks.common.util;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.errorcode.ErrorCode;
import org.code.blocks.common.exception.BaseException;
import org.code.blocks.common.exception.ValidateException;

/**
 * 公用方法类
 * @author darwindu
 * @date 2019/3/12
 **/
@Slf4j
public class CommonUtils {


    /**
     * 字符串为null转换成空，否则trim()
     * @param fieldValue
     * @return
     */
    public static String stringTrim(String fieldValue) {
        return fieldValue == null ? StringUtils.EMPTY : fieldValue.trim();
    }

    /**
     * 校验字符传不能为空
     * @param fieldName
     * @param fieldValue
     */
    public static void validateStringNotEmpty(String fieldName, String fieldValue) {
        //字段强制trim
        if (StringUtils.isEmpty(stringTrim(fieldValue))) {

            StringBuffer sb = new StringBuffer(fieldName);
            sb.append(CommonConstant.SYMBOL_VERTICAL).append(ErrorCode.FIELD_NOT_EMPTY.getCode());
            throw new ValidateException(ErrorCode.FIELD_NOT_EMPTY.getCode(), sb.toString());
        }
    }

    /**
     * 校验字节长度，字符串按"UTF-8"转换成字节，1个汉字3个字节，其他1个字节
     * @param fieldName 原文本名称
     * @param fieldValue 原文本
     * @param map 静态map
     * @param isNotEmpty 是否校验非空
     */
    public static void validateBytesgLength(String fieldName, String fieldValue, Map<String, Integer> map, boolean isNotEmpty) {
        int maxBytesLength = map.get(fieldName);
        validateBytesgLength(fieldName, fieldValue, maxBytesLength, isNotEmpty);
    }

    /**
     * 校验字节长度，字符串按"UTF-8"转换成字节，1个汉字3个字节，其他1个字节
     * @param fieldValue 原文本名称
     * @param fieldValue 原文本
     * @param maxBytesLength 最大字节长度
     * @param isNotEmpty 是否校验非空
     * @return
     */
    public static void validateBytesgLength(String fieldName, String fieldValue, int maxBytesLength, boolean isNotEmpty) {

        if (isNotEmpty) {
            validateStringNotEmpty(fieldName, fieldValue);
        }
        try {
            int actualLength = fieldValue.getBytes(CommonConstant.UTF_8).length;
            if (actualLength > maxBytesLength) {

                log.error("fieldValue max bytes length:{}, fieldValue actual bytes length:{}",
                    maxBytesLength,
                    actualLength);
                StringBuffer sb = new StringBuffer(fieldName);
                sb.append(CommonConstant.SYMBOL_SEMICOLON).append(fieldValue).append(CommonConstant.SYMBOL_VERTICAL).append(ErrorCode.OUT_OF_RANGES_ERROR.getCode());
                throw new ValidateException(ErrorCode.OUT_OF_RANGES_ERROR.getCode(), sb.toString());
            }
        } catch (UnsupportedEncodingException e) {
            throw new BaseException(e);
        }
    }

    /**
     * 校验BigDecimal长度
     * @param fieldName 原文本名称
     * @param fieldNameDecimal 原文本名称精度，小数点位数
     * @param fieldValue 原文本
     * @param map 静态map
     */
    public static void validateBigDecimalLength(String fieldName, String fieldNameDecimal, String fieldValue, Map<String, Integer> map) {
        int maxLength = map.get(fieldName);
        int decimal = map.get(fieldNameDecimal);
        validateBigDecimalLength(fieldName, fieldValue, maxLength, decimal);
    }

    /**
     * 校验BigDecimal长度
     * @param fieldName 原文本名称
     * @param fieldValue 原文本
     * @param maxLength 最大位数
     * @param decimal 小数位
     */
    public static void validateBigDecimalLength(String fieldName, String fieldValue, int maxLength, int decimal) {

        String[] ss = fieldValue.replace(CommonConstant.SYMBOL_POINT, CommonConstant.SYMBOL_HORIZONTAL).split(CommonConstant.SYMBOL_HORIZONTAL);
        StringBuffer sb = new StringBuffer(fieldName);
        sb.append(CommonConstant.SYMBOL_SEMICOLON).append(fieldValue).append(CommonConstant.SYMBOL_VERTICAL).append(ErrorCode.OUT_OF_RANGES_ERROR.getCode());
        int actualLength0 = ss[0].length();
        if(ss.length > 1) {
            int actualLength1 = ss[1].length();
            if(actualLength1 > decimal) {
                throw new ValidateException(ErrorCode.OUT_OF_RANGES_ERROR.getCode(), sb.toString());
            }
            int length = actualLength0 + actualLength1;
            if(length > maxLength) {
                throw new ValidateException(ErrorCode.OUT_OF_RANGES_ERROR.getCode(), sb.toString());
            }
            return;
        }
        if(actualLength0 > maxLength) {
            throw new ValidateException(ErrorCode.OUT_OF_RANGES_ERROR.getCode(), sb.toString());
        }
    }

}
