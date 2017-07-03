package com.zeus.state;

import org.junit.Test;


/**
 * @author xuxingbo
 * @Date 2017/7/3
 */
public class MammothTest {

    @Test
    public void test(){
        Mammoth mammoth = new Mammoth();
        mammoth.observe();

        mammoth.timePasses();
        mammoth.observe();

        mammoth.timePasses();
        mammoth.observe();
    }
}