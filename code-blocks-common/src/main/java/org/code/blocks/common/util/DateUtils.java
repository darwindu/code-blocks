package org.code.blocks.common.util;

import java.util.Date;

/**
 * 日期公用类
 * @author darwindu
 * @date 2019/3/13
 **/
public class DateUtils {

    /**
     * 获取当前时间戳
     * @return
     */
    public static Long getCurrentTime() {
        return new Date().getTime();
    }
}
