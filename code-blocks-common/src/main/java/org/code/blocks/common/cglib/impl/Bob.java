package org.code.blocks.common.cglib.impl;

import org.code.blocks.common.cglib.Person;

/**
 * 添加一个实现类, 被代理的对象
 * @author darwindu
 * @date 2019/5/6
 **/
public class Bob implements Person {

    @Override
    public void doWork() {

        try {
            //假设紧张花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I'm Bob, doing work");
    }
}
