package com.zeus.mediator;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
