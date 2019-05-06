package org.code.blocks.common.cglib.jdk;

import org.code.blocks.common.cglib.impl.Bob;
import org.code.blocks.common.cglib.impl.Bob;
import org.junit.Test;

/**
 * 静态代理
 * @author darwindu
 * @date 2019/5/6
 **/
public class ProxyPersonTest {

    @Test
    public void proxy() {

        Bob bob = new Bob();
        ProxyPerson proxyPerson = new ProxyPerson(bob);
        //调用处直接调用代理进行目标方法的操作。
        proxyPerson.doWork();
    }
}
