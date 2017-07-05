package com.zeus.serviceLocation;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class ServiceLocator {
    private static Cache cache;

    private static InitialContext context = new InitialContext();

    static{
        cache = new Cache();
    }

    public static Service getService(String jndiName){
        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        Service service1 = context.lookup(jndiName);
        cache.addService(service1);

        return service1;
    }
}
