package jdbcuserdemo2.model;

import jdbcuserdemo2.dao.SQLServerConnection;
import jdbcuserdemo2.entity.User;
import java.sql.*;

public class LoginDAOImpl implements LoginDAO {

    @Override
    public String loginStatement(User user) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from LoginInfo where username = '" + user.getUsername() + "' and password = '"
                + user.getPassword() + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println("Login success, username is:" + resultSet.getString("username"));
            return user.getUsername();
        }
        return "fail";
    }

    @Override
    public String loginPreparedStatement(User user) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "select username from LoginInfo where username = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Login preparedstatement successfully, username: " + resultSet.getString("username"));
            return user.getUsername();
        }
        return "fail";
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword("admin");
        LoginDAOImpl loginDAOImpl = new LoginDAOImpl();
        String msg = loginDAOImpl.loginStatement(user1);
        System.out.println(msg);
    }
}
