package com.zeus.flyweight;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class ShapeFactoryTest {


    @Test
    public void flyWeigthTest(){
        ShapeFactory.prepareShape();
        for(int i = 0; i < 20; i++){
           Shape shape = ShapeFactory.getShape(getRandomColor());
           shape.draw();
        }
    }


    private Color getRandomColor(){
        return Color.values()[(int)(Math.random() * Color.values().length)];
    }

}