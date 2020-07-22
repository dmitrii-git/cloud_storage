package ru.geekbrains.java2.client;

import ru.geekbrains.java2.client.command.*;

import java.io.Serializable;
import java.util.List;

public class Command implements Serializable {

    private ru.geekbrains.java2.client.CommandType type;
    private Object data;

    public Object getData() {
        return data;
    };

    public ru.geekbrains.java2.client.CommandType getType() {
        return type;
    }

    public static Command authCommand(String login, String password) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.AUTH;
        command.data = new ru.geekbrains.java2.client.command.AuthCommand(login, password);
        return command;
    }

    public static Command authErrorCommand(String errorMessage) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.AUTH_ERROR;
        command.data = new ru.geekbrains.java2.client.command.ErrorCommand(errorMessage);
        return command;
    }

    public static Command errorCommand(String errorMessage) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.ERROR;
        command.data = new ru.geekbrains.java2.client.command.ErrorCommand(errorMessage);
        return command;
    }

    public static Command messageCommand(String username, String message) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.MESSAGE;
        command.data = new ru.geekbrains.java2.client.command.MessageCommand(username, message);
        return command;
    }

    public static Command broadcastMessageCommand(String message) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.BROADCAST_MESSAGE;
        command.data = new ru.geekbrains.java2.client.command.BroadcastMessageCommand(message);
        return command;
    }

    public static Command privateMessageCommand(String receiver, String message) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.PRIVATE_MESSAGE;
        command.data = new ru.geekbrains.java2.client.command.PrivateMessageCommand(receiver, message);
        return command;
    }

    public static Command updateUsersListCommand(List<String> users) {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.UPDATE_USERS_LIST;
        command.data = new ru.geekbrains.java2.client.command.UpdateUsersListCommand(users);
        return command;
    }

    public static Command endCommand() {
        Command command = new Command();
        command.type = ru.geekbrains.java2.client.CommandType.END;
        return command;
    }

}
