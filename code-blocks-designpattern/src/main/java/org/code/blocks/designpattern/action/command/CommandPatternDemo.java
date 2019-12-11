package org.code.blocks.designpattern.action.command;

import org.code.blocks.designpattern.action.command.impl.BuyStock;
import org.code.blocks.designpattern.action.command.impl.SellStock;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
