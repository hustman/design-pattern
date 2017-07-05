package com.zeus.intercepting;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.exeucte(request);
    }

}
