package jdbcuserdemo2.model;

import java.sql.SQLException;

import jdbcuserdemo2.entity.User;

public interface LoginDAO {
    public String loginStatement(User user) throws ClassNotFoundException, SQLException;

    public String loginPreparedStatement(User user) throws ClassNotFoundException, SQLException;
}
