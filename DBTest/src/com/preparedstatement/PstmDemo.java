package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PstmDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection = GetSqlConnection.getSQLServerConnection();

        // Query
        String query = "select * from LoginInfo where username = ? and password = ?";

        // PSTM
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "admin");
        preparedStatement.setString(2, "admin");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("------------------");
            System.out.println("Username: " + resultSet.getString("username"));
            System.out.println("Password: " + resultSet.getString("password"));

        }
        connection.close();
    }
}
