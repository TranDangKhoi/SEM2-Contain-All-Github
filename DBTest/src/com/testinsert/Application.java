package com.testinsert;

import java.sql.Connection;
import java.sql.SQLException;

public class Application {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return SQLServerConnection.getSQLServerConnection();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = Application.getConnection();
        if (conn != null) {
            System.out.println("Ket noi db thanh cong");
        }
    }
}
