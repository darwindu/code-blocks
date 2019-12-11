package org.code.blocks.designpattern.action.visitor;


import org.code.blocks.designpattern.action.visitor.impl.Computer;
import org.code.blocks.designpattern.action.visitor.impl.Keyboard;
import org.code.blocks.designpattern.action.visitor.impl.Monitor;
import org.code.blocks.designpattern.action.visitor.impl.Mouse;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
