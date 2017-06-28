package com.zeus.prototype;

/**
 * @author xuxingbo
 * @Date 2017/6/28
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square draw() method");
    }
}
