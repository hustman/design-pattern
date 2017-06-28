package com.zeus.factory;

import com.zeus.factory.impl.Circle;
import com.zeus.factory.impl.Rectangle;
import com.zeus.factory.impl.Square;
import com.zeus.factory.type.ShapeType;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class ShapeFactory {

    static Shape getShape(ShapeType type){
        switch (type){
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case CIRCLE:
                return new Circle();
            default:
                throw new RuntimeException("Unsupported Shape Type");
        }
    }
}
