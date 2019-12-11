package org.code.blocks.designpattern.struct.bridge;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * @author darwindu
 * @date 2019/12/10
 **/
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
