package com.zeus.responsiblity;

/**
 * @author xuxingbo
 * @Date 2017/6/29
 */
public class LoggerChain {
    private AbstractLogger logger;

    public LoggerChain() {
        logger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

        logger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
    }

    public AbstractLogger getLogger(){
        return logger;
    }
}
