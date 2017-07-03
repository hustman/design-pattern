package com.zeus.state;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 * 猛犸象，以其状态改变作为Demo
 */
public class Mammoth {

    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    public void timePasses(){
        if(state.getClass().equals(PeacefulState.class)){
            changeStateTo(new AngryState(this));
        }else{
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State state) {
        this.state = state;
        this.state.onEnterState();
    }


    @Override
    public String toString() {
        return "The Mammoth";
    }

    public void observe(){
        this.state.observe();
    }
}
