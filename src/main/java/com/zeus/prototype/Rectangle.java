package com.zeus.prototype;

/**
 * @author xuxingbo
 * @Date 2017/6/28
 */
public class Rectangle extends Shape{

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle draw method");
    }
}
