package com.zeus.visitor;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
