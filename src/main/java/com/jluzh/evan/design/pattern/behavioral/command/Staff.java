package com.jluzh.evan.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:19 PM
 * @since
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommond(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
