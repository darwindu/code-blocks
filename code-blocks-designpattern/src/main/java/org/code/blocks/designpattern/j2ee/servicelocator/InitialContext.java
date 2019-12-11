package org.code.blocks.designpattern.j2ee.servicelocator;

import org.code.blocks.designpattern.j2ee.servicelocator.impl.Service1;
import org.code.blocks.designpattern.j2ee.servicelocator.impl.Service2;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class InitialContext {

    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
