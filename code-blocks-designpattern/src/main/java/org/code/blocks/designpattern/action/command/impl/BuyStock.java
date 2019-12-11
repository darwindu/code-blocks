package org.code.blocks.designpattern.action.command.impl;

import org.code.blocks.designpattern.action.command.Order;
import org.code.blocks.designpattern.action.command.Stock;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
