package org.code.blocks.designpattern.action.mediator;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
