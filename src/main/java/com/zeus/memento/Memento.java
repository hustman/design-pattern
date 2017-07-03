package com.zeus.memento;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
