package org.code.blocks.designpattern.struct.decorator.impl;

import org.code.blocks.designpattern.struct.decorator.Shape;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
