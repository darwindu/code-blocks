package org.code.blocks.designpattern.j2ee.interceptingfilter;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
