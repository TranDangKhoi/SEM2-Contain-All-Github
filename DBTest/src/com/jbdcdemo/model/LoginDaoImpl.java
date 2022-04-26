package com.jbdcdemo.model;

import java.sql.*;

import com.jbdcdemo.dao.SQLServerConnection;
import com.jbdcdemo.entity.User;

public class LoginDaoImpl implements LoginDAO {

    @Override
    public String checkLoginStatement(User user) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from LoginInfo where username = '" + user.getUsername()
                + "' and password ='" + user.getPassword() + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println("Login thanh cong: " + resultSet.getString("username"));
            return user.getUsername();
        }
        return "fail";
    }

    @Override
    public String checkLoginPrepare(User user) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from LoginInfo where username = ? and password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Login thanh cong: " + resultSet.getString("username"));
            return user.getUsername();
        }
        return "fail";
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");

        LoginDaoImpl loginDAO = new LoginDaoImpl();
        String msg = loginDAO.checkLoginStatement(user);
        System.out.println(msg);
    }
}
