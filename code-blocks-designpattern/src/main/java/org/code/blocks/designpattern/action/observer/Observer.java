package org.code.blocks.designpattern.action.observer;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
