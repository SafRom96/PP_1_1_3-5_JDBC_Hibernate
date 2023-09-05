package jm.task.core.jdbc;

import jm.task.core.jdbc.util.MySQLConnUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Get connection ... ");
        // Get a Connection object
        Connection conn = MySQLConnUtils.getMySQLConnection();
        System.out.println("Get connection " + conn);
        System.out.println("Done!");
    }
}
