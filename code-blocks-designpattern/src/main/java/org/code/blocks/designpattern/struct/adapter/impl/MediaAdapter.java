package org.code.blocks.designpattern.struct.adapter.impl;

import org.code.blocks.designpattern.struct.adapter.AdvancedMediaPlayer;
import org.code.blocks.designpattern.struct.adapter.MediaPlayer;

/**
 * 创建实现了 MediaPlayer 接口的适配器类。
 * @author darwindu
 * @date 2019/12/10
 **/
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
