package com.zeus.template;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class Cricket extends Game {


    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started.Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }
}
