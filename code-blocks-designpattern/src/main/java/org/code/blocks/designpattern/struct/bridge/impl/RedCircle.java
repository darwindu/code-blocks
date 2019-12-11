package org.code.blocks.designpattern.struct.bridge.impl;

import org.code.blocks.designpattern.struct.bridge.DrawAPI;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @author darwindu
 * @date 2019/12/10
 **/
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
            + radius +", x: " +x+", "+ y +"]");
    }
}
