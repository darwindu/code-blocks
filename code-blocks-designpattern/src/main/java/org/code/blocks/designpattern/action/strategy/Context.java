package org.code.blocks.designpattern.action.strategy;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
