package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService=new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Екатерина", "Антонова", (byte) 35);
        userService.saveUser("Анастасия", "Петрова", (byte) 21);
        userService.saveUser("Асан", "Аятов", (byte) 40);
        userService.saveUser("Катя", "Аббатова", (byte) 43);

        userService.getAllUsers();

        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnection();
    }
}
