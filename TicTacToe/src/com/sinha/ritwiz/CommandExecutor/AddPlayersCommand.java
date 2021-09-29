package com.sinha.ritwiz.CommandExecutor;

import com.sinha.ritwiz.Command;

public class AddPlayersCommand extends CommandExecutor {
    String commandName = "add";
    Integer paramsRequired = 4;

    @Override
    protected void execute(Command command) {
        System.out.println("Adding players command");
    }
}
