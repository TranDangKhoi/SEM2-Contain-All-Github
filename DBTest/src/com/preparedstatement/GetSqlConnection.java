package com.preparedstatement;

import java.sql.*;

public class GetSqlConnection {
    public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String serverName = "LAPTOP-87VE26VM";
        String databaseName = "logininfo";
        String username = "sa";
        String password = "sa";
        Connection conn = getSQLServerConnection(hostName, serverName, databaseName, username, password);
        return conn;
    }

    public static Connection getSQLServerConnection(String hostName, String serverName, String databaseName,
            String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + serverName
                + ";databaseName=" + databaseName;

        // String URL = "jdbc:sqlserver://localhost:1433;instance = LAPTOP-87VE26VM;data"
        Connection connection = DriverManager.getConnection(connectionString, username, password);
        return connection;

    }
}
