package com.zeus.facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class FacadeTest {
    @Test
    public void wrapOperation() throws Exception {
        Facade facade = new Facade();
        facade.wrapOperation();
    }

}