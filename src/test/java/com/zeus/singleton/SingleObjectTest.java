package com.zeus.singleton;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class SingleObjectTest {

    @Test
    public void testSingleton(){
        SingleObject obj1 = SingleObject.getInstance();

        SingleObject obj2 = SingleObject.getInstance();

        Assert.assertEquals(obj1, obj2);

    }

}