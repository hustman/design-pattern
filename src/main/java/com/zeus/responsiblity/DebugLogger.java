package com.zeus.responsiblity;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug Console::Logger: " + message);
    }
}
