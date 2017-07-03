package com.zeus.state;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class PeacefulState implements State {
    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s calms down", mammoth));
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s is calm and peaceful.", mammoth));
    }
}
