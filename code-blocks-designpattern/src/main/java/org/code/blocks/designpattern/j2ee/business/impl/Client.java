package org.code.blocks.designpattern.j2ee.business.impl;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
