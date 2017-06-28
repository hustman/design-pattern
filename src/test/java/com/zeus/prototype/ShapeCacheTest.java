package com.zeus.prototype;

import junit.framework.Assert;
import org.junit.Test;


/**
 * @author xuxingbo
 * @Date 2017/6/28
 */
public class ShapeCacheTest {

    @Test
    public void testProtoType(){
        //1->Circle,2->Square,3->Rectangle
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.println("Shape : " + circle.getType());

        Shape square = ShapeCache.getShape("2");
        System.out.println("Shape : " + square.getType());

        Shape rectangle = ShapeCache.getShape("3");
        System.out.println("Shape : " + rectangle.getType());

        //clone出来的是一个新对象
        Shape circle1 = ShapeCache.getShape("1");

        //两个对象并不相等
        Assert.assertNotSame(circle,circle1);


    }

}