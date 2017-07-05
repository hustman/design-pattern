package com.zeus.intercepting;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
