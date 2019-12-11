package org.code.blocks.designpattern.create.builder.impl;

import org.code.blocks.designpattern.create.builder.Packing;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
