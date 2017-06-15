package com.zeus.observer;

/**
 * @author xuxingbo
 * @Date 2017/6/14
 */
public interface Subject {
    public void register(Observer... observers);

    public void unregister(Observer... observer);

    /**
     * 用来模拟事件触发，以i%1的余数作为判断条件
     * 当余数为0时触发onSuccess操作，余数为1时触发onFailed操作，余数为2时触发onCancel操作
     */
    public void doSth(int i);
}
