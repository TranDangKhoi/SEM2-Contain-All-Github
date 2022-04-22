package com.databasetest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = AppConnectionExample.getConnection();

        // Tao doi tuong statement
        Statement statement = connection.createStatement();

        // Tao ResultSet chua ket qua ta ve tu Table trong CSDL
        String insert1 = "INSERT INTO Employee VALUES (6, 'F223', 'Ngan');";
        statement.executeUpdate(insert1);
        ResultSet resultSet = statement.executeQuery("select * from Employee");

        while (resultSet.next()) {
            int eId = resultSet.getInt(1);
            String empNo = resultSet.getString(2);
            String empName = resultSet.getString(3);

            System.out.println("----------------");
            System.out.println("Emp Id:" + eId);
            System.out.println("Emp RollNo: " + empNo);
            System.out.println("Emp's Name: " + empName);
        }

        connection.close();
    }
}
