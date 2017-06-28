package com.zeus.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuxingbo
 * @Date 2017/6/27
 */
public class SubjectTest {
    @Test
    public void request() throws Exception {
        Subject sub = new ProxySubject();
        sub.request();
    }

}