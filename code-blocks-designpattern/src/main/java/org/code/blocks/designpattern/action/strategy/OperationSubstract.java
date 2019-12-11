package org.code.blocks.designpattern.action.strategy;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
