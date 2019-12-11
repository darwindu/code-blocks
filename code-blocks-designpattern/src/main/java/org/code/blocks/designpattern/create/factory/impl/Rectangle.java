package org.code.blocks.designpattern.create.factory.impl;

import org.code.blocks.designpattern.create.factory.Shape;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
