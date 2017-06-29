package com.zeus.responsiblity;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class LoggerChainTest {

    @Test
    public void testLoggerChain(){
        AbstractLogger logger = new LoggerChain().getLogger();

        System.out.println("=========ERROR==========");
        logger.logMessage(AbstractLogger.ERROR, "There is a error message");

        System.out.println("=========DEBUG==========");
        logger.logMessage(AbstractLogger.DEBUG, "There is a debug message");

        System.out.println("=========INFO==========");
        logger.logMessage(AbstractLogger.INFO, "There is a info message");


    }

}