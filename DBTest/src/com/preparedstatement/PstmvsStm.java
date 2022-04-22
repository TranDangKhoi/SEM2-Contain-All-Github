package com.preparedstatement;

import java.sql.*;

public class PstmvsStm {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        statementLogin("'admin'", "'admin'");
        preparedStatementLogin("admin", "admin");
    }

    public static void statementLogin(String username, String password) throws ClassNotFoundException, SQLException {
        Connection connection = GetSqlConnection.getSQLServerConnection();
        Statement statement = connection.createStatement();
        String query = "select * from LoginInfo where username = " + username + "and password =" + password + "";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println("Login statement thanh cong");
        }
    }

    public static void preparedStatementLogin(String username, String password)
            throws ClassNotFoundException, SQLException {
        Connection connection = GetSqlConnection.getSQLServerConnection();
        String query = "select * from LoginInfo where username = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Login preparedstatement thanh cong");
        }
    }

}
