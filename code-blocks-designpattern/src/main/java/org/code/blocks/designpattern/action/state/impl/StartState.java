package org.code.blocks.designpattern.action.state.impl;

import org.code.blocks.designpattern.action.state.Context;
import org.code.blocks.designpattern.action.state.State;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
