package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Володя", "Володин", (byte) 20);
        System.out.println("User с именем - Володя добавлен в базу данных ");
        userService.saveUser("Володя1", "Володин1", (byte) 21);
        System.out.println("User с именем - Володя1 добавлен в базу данных ");
        userService.saveUser("Володя2", "Володин2", (byte) 22);
        System.out.println("User с именем - Володя2 добавлен в базу данных ");
        userService.saveUser("Володя3", "Володин3", (byte) 23);
        System.out.println("User с именем - Володя3 добавлен в базу данных ");
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
