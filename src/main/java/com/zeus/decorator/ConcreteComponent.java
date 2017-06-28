package com.zeus.decorator;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Concrete Operation");
    }
}
