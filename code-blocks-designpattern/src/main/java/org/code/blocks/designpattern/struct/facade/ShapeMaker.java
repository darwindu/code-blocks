package org.code.blocks.designpattern.struct.facade;

import org.code.blocks.designpattern.struct.facade.impl.Circle;
import org.code.blocks.designpattern.struct.facade.impl.Rectangle;
import org.code.blocks.designpattern.struct.facade.impl.Square;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
