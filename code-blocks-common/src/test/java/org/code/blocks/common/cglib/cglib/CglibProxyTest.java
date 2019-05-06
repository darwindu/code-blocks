package org.code.blocks.common.cglib.cglib;

import org.code.blocks.common.cglib.Person;
import org.code.blocks.common.cglib.impl.Bob;
import org.junit.Test;

/**
 * @author darwindu
 * @date 2019/5/6
 **/
public class CglibProxyTest {

    @Test
    public void proxy() {

        Person person = (Person)new CglibProxy().getInstance(new Bob());
        person.doWork();
    }
}
