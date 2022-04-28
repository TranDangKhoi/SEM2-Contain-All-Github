package jdbcuserdemo2.controller;

import java.sql.SQLException;

import jdbcuserdemo2.entity.User;
import jdbcuserdemo2.model.LoginDAOImpl;

public class LoginController {
    LoginDAOImpl loginDAOImpl = new LoginDAOImpl();

    public String loginStatement(User user) throws ClassNotFoundException, SQLException {
        return loginDAOImpl.loginStatement(user);
    }

    public String loginPrepareStatement(User user) throws ClassNotFoundException, SQLException {
        return loginDAOImpl.loginPreparedStatement(user);
    }
}
