package com.zeus.responsiblity;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
