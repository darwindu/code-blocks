package org.code.blocks.designpattern.create.prototype;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
