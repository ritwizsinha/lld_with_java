package com.sinha.ritwiz.CommandExecutor;

import com.sinha.ritwiz.Command;

import java.util.Objects;

public class NewGameCommand extends CommandExecutor {
    String commandName = "NEW";
    Integer paramsRequired = 1;
    NewGameCommand() {
        super();
    }

    @Override
    protected void execute(Command command) {
        System.out.println("New game is being created");
    }
}
