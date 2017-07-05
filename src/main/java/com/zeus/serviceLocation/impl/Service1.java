package com.zeus.serviceLocation.impl;

import com.zeus.serviceLocation.Service;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
