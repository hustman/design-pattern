package com.zeus.factory.impl;

import com.zeus.factory.Shape;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square draw() method");
    }
}
