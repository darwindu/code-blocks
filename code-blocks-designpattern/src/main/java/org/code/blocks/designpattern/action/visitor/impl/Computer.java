package org.code.blocks.designpattern.action.visitor.impl;

import org.code.blocks.designpattern.action.visitor.ComputerPart;
import org.code.blocks.designpattern.action.visitor.ComputerPartVisitor;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
