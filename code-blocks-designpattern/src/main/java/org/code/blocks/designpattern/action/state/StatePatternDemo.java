package org.code.blocks.designpattern.action.state;

import org.code.blocks.designpattern.action.state.impl.StartState;
import org.code.blocks.designpattern.action.state.impl.StopState;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
