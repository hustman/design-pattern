package com.zeus.interpreter;

/**
 * @author xuxingbo
 * @Date 2017/6/30
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        return content.contains(data);
    }
}
