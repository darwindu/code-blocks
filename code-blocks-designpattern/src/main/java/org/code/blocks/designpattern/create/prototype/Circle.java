package org.code.blocks.designpattern.create.prototype;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
