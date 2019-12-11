package org.code.blocks.designpattern.action.visitor;

import org.code.blocks.designpattern.action.visitor.impl.Computer;
import org.code.blocks.designpattern.action.visitor.impl.ComputerPartDisplayVisitor;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
