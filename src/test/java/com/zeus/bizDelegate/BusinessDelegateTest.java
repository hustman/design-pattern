package com.zeus.bizDelegate;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class BusinessDelegateTest {

    @Test
    public void test(){
        BusinessDelegate delegate = new BusinessDelegate();
        delegate.setServiceType("EJB");

        Client client = new Client(delegate);
        client.doTask();

        delegate.setServiceType("JMS");
        client.doTask();

    }

}