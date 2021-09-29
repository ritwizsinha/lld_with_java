package com.sinha.ritwiz.CommandExecutor;

import com.sinha.ritwiz.Command;

import java.util.Objects;

public class QuitGameCommand extends CommandExecutor {
    String commandName = "quit";
    Integer paramsRequired = 0;

    public  QuitGameCommand() {
        super();
    }

    @Override
    protected void execute(Command command) {
        System.out.println("Quit Game Command");
    }
}
