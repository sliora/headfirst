package com.example.headfirst.command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command{

    private List<Command> commands;

    public CompositeCommand() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
