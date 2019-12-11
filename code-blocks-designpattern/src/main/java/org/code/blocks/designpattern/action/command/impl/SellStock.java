package org.code.blocks.designpattern.action.command.impl;

import org.code.blocks.designpattern.action.command.Order;
import org.code.blocks.designpattern.action.command.Stock;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
