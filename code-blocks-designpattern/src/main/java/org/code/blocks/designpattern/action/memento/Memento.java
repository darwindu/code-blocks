package org.code.blocks.designpattern.action.memento;

/**
 * 创建 Memento 类。
 * @author darwindu
 * @date 2019/12/11
 **/
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
