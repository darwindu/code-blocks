package org.code.blocks.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.exception.BaseException;

/**
 * tools for properties.
 * @author darwindu
 * @date 2019/5/28
 */
@Slf4j
public final class PropertyUtils {

    private static final String PROP_NAME = "codeBlocks.properties";
    private static Properties prop = new Properties();

    static {
        try {
            loadProperties(PROP_NAME);
        } catch (BaseException e) {
            log.error("[PropertyUtils] Load codeBlocks.properties file failed.", e);
        }
    }

    /**
     * load properties from specific config file.
     *
     * @param filePath properties config file.
     */
    private static void loadProperties(String filePath) {

        try {
            InputStream in = PropertyUtils.class.getClassLoader().getResourceAsStream(filePath);
            prop.load(in);
            in.close();
        } catch (IOException e) {
            throw new BaseException(e);
        }
    }

    /**
     * get property value by specific key.
     *
     * @param key property key
     */
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    /**
     * get property value by specific key.
     *
     * @param key property key
     */
    public static String getProperty(String key, String defaultValue) {
        return prop.getProperty(key, defaultValue);
    }
}
