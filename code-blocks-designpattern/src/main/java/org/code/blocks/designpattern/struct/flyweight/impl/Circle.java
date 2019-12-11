package org.code.blocks.designpattern.struct.flyweight.impl;

import org.code.blocks.designpattern.struct.flyweight.Shape;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
            +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
