package com.zeus.strategy;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2){
        int result = strategy.operation(num1, num2);
        System.out.println("result is " + result);
    }
}
