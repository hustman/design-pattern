package com.zeus.singleton;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 双重检查式的单例模式，线程安全
 */
public class SingleWithDoubleCheck {
    private volatile static SingleWithDoubleCheck singleton;

    private SingleWithDoubleCheck() {
    }

    public static SingleWithDoubleCheck getSingleton(){
        if(singleton == null){
            synchronized (SingleWithDoubleCheck.class){
                if(singleton == null){
                    singleton = new SingleWithDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
