package org.code.blocks.designpattern.create.builder;

import org.code.blocks.designpattern.create.builder.impl.Wrapper;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * @author darwindu
 * @date 2019/12/9
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
