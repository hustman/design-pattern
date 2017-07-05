package com.zeus.intercepting;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request " + request);
    }
}
