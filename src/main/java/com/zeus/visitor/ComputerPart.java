package com.zeus.visitor;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
