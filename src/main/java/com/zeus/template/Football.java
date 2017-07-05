package com.zeus.template;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class Football extends Game {


    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started.Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished");
    }
}
