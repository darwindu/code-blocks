package org.code.blocks.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.code.blocks.common.exception.BaseException;

/**
 * 日期公用类
 * @author darwindu
 * @date 2019/3/13
 **/
public class DateUtils {

    /**日期格式：yyyy-MM-dd HH:mm:ss**/
    public final static String YMDHMS = "yyyy-MM-dd HH:mm:ss";

    /**日期格式：yyyyMMddHHmmss**/
    public final static String YMDHMS_SIMPLE = "yyyyMMddHHmmss";

    /**日期格式：yyyy-MM-dd**/
    public final static String YMD = "yyyy-MM-dd";

    /**日期格式：yyyyMMdd**/
    public final static String YMD_SIMPLE = "yyyyMMdd";

    /**日期格式：yyyy-MM**/
    public final static String YM = "yyyy-MM";

    /**日期格式：yyyyMM**/
    public final static String YM_SIMPLE = "yyyyMM";

    /**
     * 获取当前时间戳
     * @return
     */
    public static Long getCurrentTime() {
        return new Date().getTime();
    }


    /**
     * 日期转换字符串
     * @param date
     * @param format
     * @return
     */
    public static String dateToStr(Date date, String format) {
        if(date == null || StringUtils.isBlank(format)) {
            return null;
        }
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 字符串转日期
     * @param date
     * @param format
     * @return
     */
    public static Date strToDate(String date, String format) {

        try {
            if(date == null || StringUtils.isBlank(format)) {
                return null;
            }
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            throw new BaseException(e);
        }
    }
}
