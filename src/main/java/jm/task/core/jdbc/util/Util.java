package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;

public class Util {
    public static Connection getMyConnection() throws SQLException,
            ClassNotFoundException {
        return MySQLConnUtils.getMySQLConnection();
    }
}