package com.zeus.decorator;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior(){
        System.out.println("add a new behavior A");
    }
}
