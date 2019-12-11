package org.code.blocks.designpattern.action.state;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
