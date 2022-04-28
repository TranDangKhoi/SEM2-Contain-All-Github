package jdbcuserdemo2;

import java.sql.SQLException;

import jdbcuserdemo2.view.LoginConsole;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        LoginConsole loginConsole = new LoginConsole();
        loginConsole.start();
    }
}
