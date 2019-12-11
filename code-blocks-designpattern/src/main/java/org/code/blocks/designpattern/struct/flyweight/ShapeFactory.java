package org.code.blocks.designpattern.struct.flyweight;

import java.util.HashMap;

import org.code.blocks.designpattern.struct.flyweight.impl.Circle;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author darwindu
 * @date 2019/12/10
 **/
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
