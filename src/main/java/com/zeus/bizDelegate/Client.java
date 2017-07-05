package com.zeus.bizDelegate;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }
}
