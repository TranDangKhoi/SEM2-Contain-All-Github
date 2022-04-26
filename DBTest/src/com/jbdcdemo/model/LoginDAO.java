package com.jbdcdemo.model;

import java.sql.SQLException;

import com.jbdcdemo.entity.User;

public interface LoginDAO {
    public String checkLoginStatement(User user) throws ClassNotFoundException, SQLException;

    public String checkLoginPrepare(User user) throws ClassNotFoundException, SQLException;
}
