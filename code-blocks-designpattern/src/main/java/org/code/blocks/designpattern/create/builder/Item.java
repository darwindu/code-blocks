package org.code.blocks.designpattern.create.builder;

/**
 * 创建一个表示食物条目的接口。
 * @author darwindu
 * @date 2019/12/9
 **/
public interface Item {

    String name();
    Packing packing();
    float price();

}
