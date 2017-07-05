package com.zeus.bizDelegate.impl;

import com.zeus.bizDelegate.BusinessService;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
