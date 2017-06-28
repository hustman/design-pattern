package com.zeus.decorator;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
