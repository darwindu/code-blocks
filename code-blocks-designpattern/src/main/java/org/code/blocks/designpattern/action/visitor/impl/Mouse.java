package org.code.blocks.designpattern.action.visitor.impl;

import org.code.blocks.designpattern.action.visitor.ComputerPart;
import org.code.blocks.designpattern.action.visitor.ComputerPartVisitor;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
