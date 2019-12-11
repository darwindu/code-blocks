package org.code.blocks.designpattern.action.interpreter.impl;

import org.code.blocks.designpattern.action.interpreter.Expression;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
