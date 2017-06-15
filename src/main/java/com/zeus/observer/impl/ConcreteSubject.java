package com.zeus.observer.impl;

import com.google.common.base.Joiner;
import com.zeus.observer.Observer;
import com.zeus.observer.Subject;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xuxingbo
 * @Date 2017/6/14
 */
public class ConcreteSubject implements Subject {
    //使用List，说明可以重复注册
    private List<Observer> observerList = new LinkedList<Observer>();

    public void register(Observer... observers) {
        for(Observer observer : observers){
            if(observer != null) {
                synchronized (this) {
                    observerList.add(observer);
                }
            }
        }

    }

    public void unregister(Observer... observers) {
        for(Observer observer : observers) {
            if (observer != null) {
                synchronized (this) {
                    observerList.remove(observer);
                }
            }
        }
    }

    private void notifyObservers(Type type) {
        switch (type){
            case SUCCESS:
                for(Observer o : observerList){
                    o.onSuccess();
                }
                break;
            case FAILED:
                for(Observer o : observerList){
                    o.onFailed();
                }
                break;
            case CANCEL:
                for (Observer o : observerList) {
                    o.onCancel();
                }
                break;
            default:
                break;
        }
    }

    public void doSth(int i) {
        Type type;
        if(i % 3 == 0){
            type = Type.SUCCESS;
        }else if(i % 3 == 1){
            type = Type.FAILED;
        }else{
            type = Type.CANCEL;
        }
        notifyObservers(type);
    }

    private enum Type{
        SUCCESS,FAILED,CANCEL
    }


    @Override
    public String toString() {
        String observerStr = Joiner.on(",").join(observerList);
        return "ConcreteSubject{" +
                "observerList=" + observerStr +
                '}';
    }
}
