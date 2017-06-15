package com.zeus.observer;

/**
 * @author xuxingbo
 * @Date 2017/6/14
 */
public interface Observer {

    public void onSuccess();

    public void onFailed();

    public void onCancel();
}
