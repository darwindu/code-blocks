package org.code.blocks.common.cglib.jdk;

import org.code.blocks.common.cglib.Person;
import org.code.blocks.common.cglib.impl.Bob;
import org.junit.Test;

/**
 * jdk动态代理
 * @author darwindu
 * @date 2019/5/6
 **/
public class JdkProxyTest {

    @Test
    public void proxy() {

        Person person = new JdkProxy<Bob>().getInstance(new Bob());
        //注意这里的person不是目标类person，而是代理类person：debug的时候显示null，有'$'标识符
        person.doWork();
    }
}
