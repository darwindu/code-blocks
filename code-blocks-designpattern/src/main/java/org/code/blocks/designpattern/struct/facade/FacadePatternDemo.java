package org.code.blocks.designpattern.struct.facade;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
