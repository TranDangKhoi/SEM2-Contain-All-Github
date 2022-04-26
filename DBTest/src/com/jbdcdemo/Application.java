package com.jbdcdemo;

import java.sql.SQLException;

import com.jbdcdemo.view.LoginConsole;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        LoginConsole loginConsole = new LoginConsole();
        loginConsole.start();
    }
}
