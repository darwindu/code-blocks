package org.code.blocks.designpattern.struct.proxy.impl;

import org.code.blocks.designpattern.struct.proxy.Image;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
