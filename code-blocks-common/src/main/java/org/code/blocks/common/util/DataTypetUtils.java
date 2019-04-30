package org.code.blocks.common.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.exception.BaseException;

/**
 * Data type conversion utilities between solidity data type and java data type.
 *
 * @author darwindu
 * @date 2019/3/4
 */
@Slf4j
public final class DataTypetUtils {

    /**
     * String to bytes 32.
     *
     * @param string the string
     * @return the bytes 32
     */
    public static byte[] stringToBytes32(String string) {

        byte[] byteValueLen32 = new byte[CommonConstant.BYTES32_FIXED_LENGTH];
        if (StringUtils.isEmpty(string)) {
            return byteValueLen32;
        }
        try {
            byte[] byteValue = string.getBytes(CommonConstant.UTF_8);
            System.arraycopy(byteValue, 0, byteValueLen32, 0, byteValue.length);
        } catch (UnsupportedEncodingException e) {
            log.error("stringToBytes32 is exception", e);
            throw new BaseException(e.getCause());
        }
        return byteValueLen32;
    }


    /**
     * String array to bytes32 list.
     * @param stringArray
     * @return
     */
    public static List<byte[]> stringArrayToBytes32List(String[] stringArray) {

        List<byte[]> bytes32List = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            bytes32List.add(stringToBytes32(stringArray[i]));
        }
        return bytes32List;
    }

    /**
     * string to bytes32 list, if return size is not enough, fill return list
     * @param s
     * @param listFixedLength
     * @return
     */
    public static List<byte[]> stringToBytes32List(String s, int listFixedLength) {

        List<byte[]> resultList = stringToBytes32List(s);
        int resultListSize = resultList.size();
        if(resultListSize < listFixedLength) {

            byte[] byteValueLength32 = new byte[CommonConstant.BYTES32_FIXED_LENGTH];
            for (int i = 0 ; i < listFixedLength - resultListSize; i ++) {
                resultList.add(byteValueLength32);
            }
        }
        return resultList;
    }

    /**
     * string to bytes32 list
     * @param s
     * @return
     */
    public static List<byte[]> stringToBytes32List(String s) {

        try{
            byte[] byteValueArr = s.getBytes(CommonConstant.UTF_8);

            int size = byteValueArr.length;
            Integer mod = (size%CommonConstant.BYTES32_FIXED_LENGTH == 0) ? 0 : 1;
            Integer byteSize = size/CommonConstant.BYTES32_FIXED_LENGTH + mod;

            List<byte[]> resultList = new ArrayList<>();
            for (int i = 0; i < byteSize; i ++) {
                byte[] byteValueLength32 = new byte[CommonConstant.BYTES32_FIXED_LENGTH];
                int descLength = CommonConstant.BYTES32_FIXED_LENGTH;
                if((i+1)*32 > size) {
                    descLength = size - i*CommonConstant.BYTES32_FIXED_LENGTH;
                }
                System.arraycopy(byteValueArr, i*CommonConstant.BYTES32_FIXED_LENGTH, byteValueLength32, 0, descLength);
                resultList.add(byteValueLength32);
            }
            return resultList;
        } catch (UnsupportedEncodingException e) {
            log.error("stringToByte32List is exception", e);
            throw new BaseException(e);
        }
    }

    /**
     * bytes32 list to string, which list is fixed list
     * @param bytes32List
     * @param desPos
     * @param desLength
     * @return
     */
    public static String bytes32ListToString(List<byte[]> bytes32List, int desPos, int desLength) {

        List<byte[]> desBytes32List = bytes32List.subList(desPos, desPos + desLength);
        return bytes32ListToString(desBytes32List);
    }

    /**
     * bytes32 list to string
     * @param bytes32List
     * @return
     */
    public static String bytes32ListToString(List<byte[]> bytes32List) {

        try {
            int size = bytes32List.size();
            byte[] destArr = new byte[size*CommonConstant.BYTES32_FIXED_LENGTH];
            for (int i = 0; i < size; i++) {
                System.arraycopy(bytes32List.get(i), 0, destArr, i*CommonConstant.BYTES32_FIXED_LENGTH, CommonConstant.BYTES32_FIXED_LENGTH);
            }
            return new String(destArr, CommonConstant.UTF_8).trim();
        } catch (UnsupportedEncodingException e) {
            log.error("byte32ListToString is exception", e);
            throw new BaseException(e);
        }
    }

    /**
     * bytes32 to string
     * @param bytes32List
     * @return
     */
    public static String bytes32ToString(byte[] bytes32List) {

        try {
            byte[] destArr = new byte[CommonConstant.BYTES32_FIXED_LENGTH];
            System.arraycopy(bytes32List, 0, destArr, 0, CommonConstant.BYTES32_FIXED_LENGTH);
            return new String(destArr, CommonConstant.UTF_8).trim();
        } catch (UnsupportedEncodingException e) {
            log.error("byte32ListToString is exception", e);
            throw new BaseException(e);
        }
    }

}
