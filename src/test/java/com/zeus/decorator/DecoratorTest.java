package com.zeus.decorator;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class DecoratorTest {

    @Test
    public void operation() throws Exception {
        System.out.println("=========RealComponent===========");
        //real component
        Component realComponent = new ConcreteComponent();
        realComponent.operation();
        System.out.println("=========Decorator A ============");
        //decorator A
        Component decoratorA = new ConcreteDecoratorA(realComponent);
        decoratorA.operation();
        System.out.println("=========Decorator B ============");
        //decorator B
        Component decoratorB = new ConcreteDecoratorB(realComponent);
        decoratorB.operation();
    }

}