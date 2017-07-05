package com.zeus.visitor;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class ComputerPartDisplayVisitorTest {


    @Test
    public void test(){
        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}