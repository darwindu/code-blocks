package org.code.blocks.designpattern.j2ee.business.impl;

import org.code.blocks.designpattern.j2ee.business.BusinessService;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
