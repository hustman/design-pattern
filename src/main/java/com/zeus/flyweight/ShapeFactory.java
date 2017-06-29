package com.zeus.flyweight;

import java.util.HashMap;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class ShapeFactory {
    private static final HashMap<Color, Shape> shapeFactory = new HashMap<>();

    public static void prepareShape(){
        for(Color color : Color.values()){
            Shape circle = new Circle(color);
            shapeFactory.put(color, circle);
        }
    }

    public static Shape getShape(Color color){
        return shapeFactory.get(color);
    }
}
