package org.code.blocks.designpattern.struct.proxy.impl;

import org.code.blocks.designpattern.struct.proxy.Image;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
