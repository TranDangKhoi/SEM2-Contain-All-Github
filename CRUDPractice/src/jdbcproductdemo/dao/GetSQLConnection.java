package jdbcproductdemo.dao;

import java.sql.*;

public class GetSQLConnection {
    public static Connection SQLServerConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String serverName = "LAPTOP-87VE26VM";
        String databaseName = "logininfo";
        String username = "sa";
        String password = "sa";
        Connection connection = SQLServerConnection(hostName, serverName, databaseName, username, password);
        return connection;
    }

    public static Connection SQLServerConnection(String hostName, String serverName, String databaseName,
            String username,
            String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionString = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + serverName
                + ";databaseName=" + databaseName;

        // String URL = "jdbc:sqlserver://localhost:1433;instance = LAPTOP-87VE26VM;data"
        Connection connection = DriverManager.getConnection(connectionString, username, password);
        return connection;
    }
}
