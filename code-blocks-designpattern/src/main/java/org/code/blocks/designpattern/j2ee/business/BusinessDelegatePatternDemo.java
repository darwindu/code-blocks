package org.code.blocks.designpattern.j2ee.business;

import org.code.blocks.designpattern.j2ee.business.impl.BusinessDelegate;
import org.code.blocks.designpattern.j2ee.business.impl.Client;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
