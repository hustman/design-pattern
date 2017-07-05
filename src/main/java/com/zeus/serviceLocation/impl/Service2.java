package com.zeus.serviceLocation.impl;

import com.zeus.serviceLocation.Service;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
