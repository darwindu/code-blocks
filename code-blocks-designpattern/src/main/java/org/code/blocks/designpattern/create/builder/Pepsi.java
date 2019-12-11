package org.code.blocks.designpattern.create.builder;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
