package org.code.blocks.designpattern.action.visitor;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
