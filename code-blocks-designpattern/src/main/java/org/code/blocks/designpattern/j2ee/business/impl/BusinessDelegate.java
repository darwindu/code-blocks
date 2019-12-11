package org.code.blocks.designpattern.j2ee.business.impl;

import org.code.blocks.designpattern.j2ee.business.BusinessService;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
