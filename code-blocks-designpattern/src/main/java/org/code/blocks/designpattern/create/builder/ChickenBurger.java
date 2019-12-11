package org.code.blocks.designpattern.create.builder;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
