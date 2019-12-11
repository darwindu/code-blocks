package org.code.blocks.designpattern.create.prototype;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
