package com.zeus.singleton;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 懒汉式，非线程安全
 */
public class SingleLazyLoad {
    private static SingleLazyLoad instance;

    private SingleLazyLoad(){}

    public static SingleLazyLoad getInstance(){
        if(instance == null){
            instance = new SingleLazyLoad();
        }
        return instance;
    }
}
