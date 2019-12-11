package org.code.blocks.designpattern.action.mediator;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
