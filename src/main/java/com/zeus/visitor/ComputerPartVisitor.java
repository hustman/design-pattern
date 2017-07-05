package com.zeus.visitor;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Computer computer);

}
