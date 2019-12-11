package org.code.blocks.designpattern.action.nullobject;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
