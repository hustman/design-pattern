package com.zeus.proxy;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class ProxySubject extends Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
       addBefore();
       realSubject.request();
       addAfter();
    }

    private void addBefore(){
        System.out.println("add behavior before");
    }

    private void addAfter(){
        System.out.println("add behavior after");
    }
}
