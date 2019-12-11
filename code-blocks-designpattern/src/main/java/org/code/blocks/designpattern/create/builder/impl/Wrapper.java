package org.code.blocks.designpattern.create.builder.impl;

import org.code.blocks.designpattern.create.builder.Packing;

/**
 * 创建实现 Packing 接口的实体类。
 * @author darwindu
 * @date 2019/12/9
 **/
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
