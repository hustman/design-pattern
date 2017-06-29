package com.zeus.facade;

import java.util.Arrays;
import java.util.List;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class Facade {
    private List<Component> components;

    public Facade() {
        components = Arrays.asList(new ComponentA(),new ComponentB(),new ComponentC());
    }

    public void wrapOperation(){
        for(Component component : components){
            component.operation();
        }
    }
}
