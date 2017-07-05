package com.zeus.intercepting;

import com.zeus.intercepting.impl.AuthenticationFilter;
import com.zeus.intercepting.impl.DebugFilter;
import org.junit.Test;


/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class ClientTest {

    @Test
    public void test(){
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);

        client.sendRequest("HOME");
    }

}