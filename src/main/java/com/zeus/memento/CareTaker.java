package com.zeus.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
