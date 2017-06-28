package com.zeus.singleton;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 饿汉式，使用类加载机制确保线程安全
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

}
