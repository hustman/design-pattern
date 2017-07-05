package com.zeus.intercepting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void exeucte(String request){
        for(Filter filter : filters){
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
