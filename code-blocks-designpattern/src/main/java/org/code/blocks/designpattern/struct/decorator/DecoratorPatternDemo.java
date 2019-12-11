package org.code.blocks.designpattern.struct.decorator;

import org.code.blocks.designpattern.struct.decorator.impl.Circle;
import org.code.blocks.designpattern.struct.decorator.impl.Rectangle;
import org.code.blocks.designpattern.struct.decorator.impl.RedShapeDecorator;
import org.code.blocks.designpattern.struct.decorator.impl.ShapeDecorator;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
