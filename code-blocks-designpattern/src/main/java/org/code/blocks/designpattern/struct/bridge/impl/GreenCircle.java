package org.code.blocks.designpattern.struct.bridge.impl;

import org.code.blocks.designpattern.struct.bridge.DrawAPI;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
            + radius +", x: " +x+", "+ y +"]");
    }
}
