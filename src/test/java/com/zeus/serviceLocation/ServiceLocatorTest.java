package com.zeus.serviceLocation;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class ServiceLocatorTest {

    @Test
    public void test(){
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }

}