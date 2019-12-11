package org.code.blocks.designpattern.struct.decorator.impl;

import org.code.blocks.designpattern.struct.decorator.Shape;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
