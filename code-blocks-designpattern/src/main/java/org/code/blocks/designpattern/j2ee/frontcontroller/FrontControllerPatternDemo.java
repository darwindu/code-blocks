package org.code.blocks.designpattern.j2ee.frontcontroller;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
