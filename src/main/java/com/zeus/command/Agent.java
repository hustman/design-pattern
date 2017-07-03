package com.zeus.command;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuxingbo
 * @Date 2017/6/30
 */
public class Agent {
    private List<Command> commands = new ArrayList<>();

    public void receiveCommand(Command command){
        Preconditions.checkNotNull(command, "命令不能为空");
        commands.add(command);
    }

    public void executeCommands(){
        for(Command command : commands){
            command.execute();
        }
    }
}
