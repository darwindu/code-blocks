package org.code.blocks.designpattern.j2ee.compositeentity;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
