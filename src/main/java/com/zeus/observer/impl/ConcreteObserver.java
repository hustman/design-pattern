package com.zeus.observer.impl;

import com.zeus.observer.Observer;

/**
 * @author xuxingbo
 * @Date 2017/6/14
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void onSuccess() {
        System.out.println("Observer " + name + " receive subject SUCCESS");
    }

    public void onFailed() {
        System.out.println("Observer " + name + " receive subject FAILED");
    }

    public void onCancel() {
        System.out.println("Observer " + name + " receive subject CANCEL");
    }

    @Override
    public String toString() {
        return "ConcreteObserver{" +
                "name='" + name + '\'' +
                '}';
    }
}
