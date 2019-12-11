package org.code.blocks.designpattern.action.nullobject;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
