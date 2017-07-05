package com.zeus.strategy;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class ContextTest {

    @Test
    public void testStrategy(){
        Context context = new Context(new StrategyAdd());
        context.executeStrategy(2,1);

        context.setStrategy(new StrategySubstract());
        context.executeStrategy(2,1);

        context.setStrategy(new StrategyMultiply());
        context.executeStrategy(2,1);
    }

}