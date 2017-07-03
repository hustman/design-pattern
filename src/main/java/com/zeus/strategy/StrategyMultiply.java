package com.zeus.strategy;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class StrategyMultiply implements Strategy{

    @Override
    public int operation(int num1, int num2) {
        return num1 * num2;
    }
}
