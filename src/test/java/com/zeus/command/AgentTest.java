package com.zeus.command;

import org.junit.Test;

/**
 * @author xuxingbo
 * @Date 2017/6/30
 */
public class AgentTest {

    @Test
    public void testCommandPattern(){
        Product product = new Product("麦旋风",10.0);

        BuyCommand buyCommand = new BuyCommand(product);
        SellCommand sellCommand = new SellCommand(product);

        Agent agent = new Agent();
        agent.receiveCommand(buyCommand);
        agent.receiveCommand(sellCommand);

        agent.executeCommands();
    }

}