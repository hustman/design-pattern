package com.zeus.serviceLocation;

import com.zeus.serviceLocation.impl.Service1;
import com.zeus.serviceLocation.impl.Service2;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class InitialContext {

    public Service lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 Object");
            return new Service1();
        }else if(jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 Object");
            return new Service2();
        }
        return null;
    }
}
