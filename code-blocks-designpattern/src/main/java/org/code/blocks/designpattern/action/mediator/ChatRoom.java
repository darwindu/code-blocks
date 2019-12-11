package org.code.blocks.designpattern.action.mediator;

import java.util.Date;

/**
 * 创建中介类。
 * @author darwindu
 * @date 2019/12/11
 **/
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
