package org.code.blocks.designpattern.create.builder;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
