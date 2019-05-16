package org.code.blocks.spring.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author darwindu
 * @date 2019/5/16
 **/
public class BaseServiceImpl {

    protected static final ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("codeBolcksApplicationContext.xml");
    }
}
