package com.zeus.state;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public interface State {

    void onEnterState();

    void observe();
}
