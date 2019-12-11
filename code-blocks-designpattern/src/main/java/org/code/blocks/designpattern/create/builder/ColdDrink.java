package org.code.blocks.designpattern.create.builder;

import org.code.blocks.designpattern.create.builder.impl.Bottle;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
