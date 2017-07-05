package com.zeus.serviceLocation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class Cache {
    private Map<String,Service> services;

    public Cache(){
        services = new HashMap<String,Service>();
    }

    public Service getService(String serviceName){
        return services.get(serviceName);
    }

    public void addService(Service service){
        services.putIfAbsent(service.getName(), service);
    }
}
