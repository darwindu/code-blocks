package org.code.blocks.designpattern.struct.bridge;

import org.code.blocks.designpattern.struct.bridge.impl.GreenCircle;
import org.code.blocks.designpattern.struct.bridge.impl.RedCircle;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
