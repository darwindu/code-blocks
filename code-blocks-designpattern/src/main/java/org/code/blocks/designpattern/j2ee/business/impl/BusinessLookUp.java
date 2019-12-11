package org.code.blocks.designpattern.j2ee.business.impl;

import org.code.blocks.designpattern.j2ee.business.BusinessService;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
