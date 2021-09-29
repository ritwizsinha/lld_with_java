package com.sinha.ritwiz.CommandExecutor;

import com.sinha.ritwiz.Command;

public class MoveCommand extends  CommandExecutor {
    String commandName = "move";
    Integer paramsRequired = 2;

    public  MoveCommand() {
        super();
    }

    @Override
    protected void execute(Command command) {
        System.out.println("Move Command occured");
    }
}
