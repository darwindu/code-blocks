package org.code.blocks.designpattern.create.abstractfactory.impl;

import org.code.blocks.designpattern.create.abstractfactory.Color;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
