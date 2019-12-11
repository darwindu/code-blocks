package org.code.blocks.designpattern.struct.decorator.impl;

import org.code.blocks.designpattern.struct.decorator.Shape;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
