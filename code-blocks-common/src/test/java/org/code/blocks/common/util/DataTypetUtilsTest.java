package org.code.blocks.common.util;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/4/30
 **/
@Slf4j
public class DataTypetUtilsTest {

    @Test
    public void stringToBytes32() {

        String s = "Hello World!";
        byte[] b =  DataTypetUtils.stringToBytes32(s);

        String responseData = DataTypetUtils.bytes32ToString(b);
        log.info("responseData: {}", responseData);

        Assert.assertNotNull(responseData);
    }

    @Test
    public void stringArrayToBytes32List() {

        String[] ss = new String[]{"Hello", "World"};
        List<byte[]> list =  DataTypetUtils.stringArrayToBytes32List(ss);

        for(byte[] b : list) {
            String responseData = DataTypetUtils.bytes32ToString(b);
            log.info("responseData: {}", responseData);
        }

        Assert.assertNotNull(list);
    }

    @Test
    public void stringToBytes32List() {

        String s = "Hello World!1 Hello World!2 Hello World!3 Hello World!4 Hello World!5 Hello World!6 Hello World!7";
        List<byte[]> list =  DataTypetUtils.stringToBytes32List(s, 2);

        String responseData = DataTypetUtils.bytes32ListToString(list, 1, 1);
        log.info("responseData: {}", responseData);
        Assert.assertNotNull(list);
    }

    @Test
    public void stringToBytes32List2() {

        String s = "Hello World! 一二三四五六七八九十";
        List<byte[]> list =  DataTypetUtils.stringToBytes32List(s, 1);
        log.info("list.size:: {}", list.size());

        String responseData = DataTypetUtils.bytes32ListToString(list);
        log.info("responseData: {}", responseData);
        Assert.assertNotNull(list);
    }
}
