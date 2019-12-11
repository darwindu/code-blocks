package org.code.blocks.designpattern.j2ee.interceptingfilter.impl;

import org.code.blocks.designpattern.j2ee.interceptingfilter.Filter;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class DebugFilter implements Filter {

    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
