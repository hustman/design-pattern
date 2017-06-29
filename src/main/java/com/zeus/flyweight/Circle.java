package com.zeus.flyweight;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class Circle extends Shape{

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color.name() + ", Potion=" + System.identityHashCode(this) + "]");
    }
}
