package com.preparedstatement;

import java.sql.Connection;
import java.sql.SQLException;

public class AppConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return GetSqlConnection.getSQLServerConnection();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = AppConnection.getConnection();
        if (conn != null) {
            System.out.println("Ket noi db thanh cong");
        }
    }
}
