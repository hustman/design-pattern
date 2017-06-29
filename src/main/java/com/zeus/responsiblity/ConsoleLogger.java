package com.zeus.responsiblity;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level =level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Stander Console::Logger: " + message);
    }
}
