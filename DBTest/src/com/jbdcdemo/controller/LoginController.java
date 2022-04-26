package com.jbdcdemo.controller;

import java.sql.SQLException;

import com.jbdcdemo.entity.User;
import com.jbdcdemo.model.LoginDaoImpl;

public class LoginController {
    //Step 2: Call instance of model
    LoginDaoImpl loginDao = new LoginDaoImpl();

    public String loginStatementController(User user) throws ClassNotFoundException, SQLException {
        return loginDao.checkLoginStatement(user);
    }

    public String loginPrepareStatementController(User user) throws ClassNotFoundException, SQLException {
        return loginDao.checkLoginPrepare(user);
    }
}
