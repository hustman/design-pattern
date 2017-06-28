package com.zeus.singleton;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 懒汉式加载，线程安全
 */
public class ThreadSafeLazyLoad {
    private static ThreadSafeLazyLoad instance;

    private ThreadSafeLazyLoad() {
    }

    public static synchronized ThreadSafeLazyLoad getInstance(){
        if(instance == null){
            instance = new ThreadSafeLazyLoad();
        }
        return instance;
    }
}
