package jdbcuserdemo.controller;

import java.sql.SQLException;

import jdbcuserdemo.entity.User;
import jdbcuserdemo.model.UserDaoImpl;

public class LoginController {
    UserDaoImpl userDao = new UserDaoImpl();

    public String loginStatement(User user) throws ClassNotFoundException, SQLException {
        return userDao.loginStatement(user);
    }

    public String loginPrepareStatement(User user) throws ClassNotFoundException, SQLException {
        return userDao.loginPrepareStatement(user);
    }
}
