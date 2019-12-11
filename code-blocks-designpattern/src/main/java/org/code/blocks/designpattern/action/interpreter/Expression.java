package org.code.blocks.designpattern.action.interpreter;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public interface Expression {
    boolean interpret(String context);
}
