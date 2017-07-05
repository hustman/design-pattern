package com.zeus.intercepting.impl;

import com.zeus.intercepting.Filter;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
