package org.code.blocks.common.util;

import java.util.HashMap;
import java.util.Map;

import org.code.blocks.common.exception.ValidateException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/4/30
 **/
public class CommonUtilsTest {

    @Test
    public void validateBytesgLength() {

        String merchantId = "12345678901234567890123456789012";
        CommonUtils.validateBytesgLength(MerchantConstant.MERCHANT_MERCHANTID, merchantId, new MerchantConstant().getMerchantMap(), true);
    }

    @Test
    public void validateBytesgLength2() {

        String merchantId = "123456789012345678901234567890123";
        try {

            CommonUtils.validateBytesgLength(MerchantConstant.MERCHANT_MERCHANTID, merchantId, new MerchantConstant().getMerchantMap(), true);
        } catch (ValidateException e) {
            Assert.assertEquals(CommonErrorCode.OUT_OF_RANGES_ERROR.getCode(), e.getErrorCode().intValue());
        }
    }

    @Test
    public void validateBytesgLength3() {

        String merchantName = "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十";
        CommonUtils.validateBytesgLength(MerchantConstant.MERCHANT_MERCHANTNAME, merchantName, new MerchantConstant().getMerchantMap(), true);
    }

    @Test
    public void validateBytesgLength4() {

        String merchantName = "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十";
        try {

            CommonUtils.validateBytesgLength(MerchantConstant.MERCHANT_MERCHANTNAME, merchantName, new MerchantConstant().getMerchantMap(), true);
        } catch (ValidateException e) {
            Assert.assertEquals(CommonErrorCode.OUT_OF_RANGES_ERROR.getCode(), e.getErrorCode().intValue());
        }
    }

    class MerchantConstant {

        public static final String MERCHANT_MERCHANTID = "merchantId";
        public static final String MERCHANT_MERCHANTNAME = "merchantName";
        public static final String MERCHANT_MALLID = "mallId";
        public static final String MERCHANT_MALLNAME = "mallName";
        public static final String MERCHANT_PUBLICKEYBASE64 = "publicKeyBase64";

        public Map<String, Integer> merchantMap = new HashMap<>();

        public MerchantConstant() {
            merchantMap.put(MERCHANT_MERCHANTID, 32);
            merchantMap.put(MERCHANT_MERCHANTNAME, 30*3);
            merchantMap.put(MERCHANT_MALLID, 32);
            merchantMap.put(MERCHANT_MALLNAME, 30*3);
            merchantMap.put(MERCHANT_PUBLICKEYBASE64, 128);
        }

        public Map<String, Integer> getMerchantMap() {
            return merchantMap;
        }

    }
}
