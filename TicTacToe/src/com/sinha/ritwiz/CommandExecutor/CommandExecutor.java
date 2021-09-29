package com.sinha.ritwiz.CommandExecutor;

import com.sinha.ritwiz.Command;

import java.util.Objects;

public abstract class CommandExecutor {
    String commandName;
    int paramsRequired;
    public boolean run(Command command) {
        if (validate(command)) {
            execute(command);
            return true;
        }

        return false;
    }
    protected boolean validate(Command command) {
        if (!Objects.equals(command.getCommandName(), this.commandName)) {
            return false;
        }

        return command.paramSize() == this.paramsRequired;
    }
    protected abstract  void execute(Command command);
}
