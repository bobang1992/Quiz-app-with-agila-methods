package org.example.command;

public interface CommandManager
{
    void registerCommand(Command command);
    void tryExecuteCommand(String input);
}