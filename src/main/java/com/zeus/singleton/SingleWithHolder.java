package com.zeus.singleton;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 * 登记式的单例模式，线程安全
 */
public class SingleWithHolder {

    private static class SingletonHolder{
        private static final SingleWithHolder INSTANCE = new SingleWithHolder();
    }

    private SingleWithHolder() {
    }

    public static final SingleWithHolder getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
