package org.code.blocks.designpattern.j2ee.servicelocator.impl;

import org.code.blocks.designpattern.j2ee.servicelocator.Service;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Service1 implements Service {

    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
