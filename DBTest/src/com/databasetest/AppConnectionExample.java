package com.databasetest;

import java.sql.SQLException;
import java.sql.Connection;

public class AppConnectionExample {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return SQLServerConnection.getSQLServerConnection();
    }

    public static Connection getConnection2() throws SQLException, ClassNotFoundException {
        return MySQLServer.getMySQLConnection();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = AppConnectionExample.getConnection();
        if (conn != null) {
            System.out.println("Ket noi db thanh cong");
        }

    }
}
