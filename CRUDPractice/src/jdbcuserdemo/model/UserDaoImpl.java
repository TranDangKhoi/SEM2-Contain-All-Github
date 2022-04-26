package jdbcuserdemo.model;

import java.sql.*;

import jdbcuserdemo.dao.SQLServerConnection;
import jdbcuserdemo.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public String loginStatement(User user) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from LoginInfo where username = '" + user.getUsername() + "' and password = '"
                + user.getPassword() + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println("Login success, username: " + resultSet.getString("username"));
            return user.getUsername();
        }
        return "fail";
    }

    @Override
    public String loginPrepareStatement(User user) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from LoginInfo where username = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println("Login success, username: " + resultSet.getString("username"));
            return user.getUsername();
        }

        return "fail";
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword("admin");
        UserDaoImpl userDao = new UserDaoImpl();
        String msg = userDao.loginStatement(user1);
        System.out.println(msg);
    }

}
