package org.code.blocks.common.cglib.jdk;

import org.code.blocks.common.cglib.MonitorUtil;
import org.code.blocks.common.cglib.Person;

/**
 * 静态代理，代理必须和目标类实现共同的接口
 * @author darwindu
 * @date 2019/5/6
 **/
public class ProxyPerson implements Person {

    // 被代理人
    private Person person;

    public ProxyPerson(Person person) {
        this.person = person;
    }

    @Override
    public void doWork() {

        System.out.println("todo::start");
        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();

        person.doWork();

        System.out.println("todo::end");
        MonitorUtil.finish("doWork");
    }
}
