package com.zeus.prototype;

/**
 * @author xuxingbo
 * @Date 2017/6/28
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle draw() method");
    }
}
