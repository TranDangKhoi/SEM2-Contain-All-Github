package jdbcuserdemo.model;

import java.sql.SQLException;

import jdbcuserdemo.entity.User;

public interface UserDao {

    public String loginStatement(User user) throws ClassNotFoundException, SQLException;

    public String loginPrepareStatement(User user) throws ClassNotFoundException, SQLException;

}
