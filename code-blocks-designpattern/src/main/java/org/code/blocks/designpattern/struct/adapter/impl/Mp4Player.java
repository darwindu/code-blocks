package org.code.blocks.designpattern.struct.adapter.impl;

import org.code.blocks.designpattern.struct.adapter.AdvancedMediaPlayer;

/**
 * @author darwindu
 * @date 2019/12/10
 **/
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
