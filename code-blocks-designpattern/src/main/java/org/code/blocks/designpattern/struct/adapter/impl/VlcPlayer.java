package org.code.blocks.designpattern.struct.adapter.impl;

import org.code.blocks.designpattern.struct.adapter.AdvancedMediaPlayer;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
