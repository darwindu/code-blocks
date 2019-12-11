package org.code.blocks.designpattern.create.abstractfactory;

import org.code.blocks.designpattern.create.abstractfactory.impl.Blue;
import org.code.blocks.designpattern.create.abstractfactory.impl.Green;
import org.code.blocks.designpattern.create.abstractfactory.impl.Red;

/**
 * @author darwindu
 * @date 2019/12/9
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
