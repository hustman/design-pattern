package com.zeus.template;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class GameTest {

    @Test
    public void testTemplateMethod(){
        Game game = new Cricket();
        game.play();

        Game ball = new Football();
        ball.play();
    }
}