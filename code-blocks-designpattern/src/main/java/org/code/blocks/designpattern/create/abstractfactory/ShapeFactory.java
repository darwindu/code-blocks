package org.code.blocks.designpattern.create.abstractfactory;

import org.code.blocks.designpattern.create.abstractfactory.impl.Circle;
import org.code.blocks.designpattern.create.abstractfactory.impl.Rectangle;
import org.code.blocks.designpattern.create.abstractfactory.impl.Square;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
