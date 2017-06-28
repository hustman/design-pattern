package com.zeus.proxy;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
