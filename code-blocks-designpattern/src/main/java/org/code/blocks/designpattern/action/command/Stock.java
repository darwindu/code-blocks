package org.code.blocks.designpattern.action.command;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
