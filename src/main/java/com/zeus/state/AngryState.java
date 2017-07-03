package com.zeus.state;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class AngryState implements State {

    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s gets angry", mammoth));

    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is furious.", mammoth));

    }
}
