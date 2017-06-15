package com.zeus.observer;

import com.zeus.observer.impl.ConcreteObserver;
import com.zeus.observer.impl.ConcreteSubject;

/**
 * @author xuxingbo
 * @Date 2017/6/15
 */
public class Main {

    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("A");
        Observer observer2 = new ConcreteObserver("B");

        Subject subject = new ConcreteSubject();
        subject.register(observer1, observer2);
        //invoke Observer onSuccess method
        subject.doSth(0);
        //invoke Observer onFailed method
        subject.doSth(1);
        //invoke Observer onCancel method
        subject.doSth(2);
    }
}
