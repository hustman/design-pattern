package com.zeus.factory;

import com.zeus.factory.type.ShapeType;
import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class ShapeFactoryTest {
    @Test
    public void getShape() throws Exception {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }

}