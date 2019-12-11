package org.code.blocks.designpattern.struct.facade.impl;

import org.code.blocks.designpattern.struct.facade.Shape;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
