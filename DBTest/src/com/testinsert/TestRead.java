package com.testinsert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class TestRead {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PrintStream out = new PrintStream(System.out, true, UTF_8);
        Connection connection = Application.getConnection();

        // Tao ra mot statement de thuc hien lenh query
        Statement statement = connection.createStatement();

        // Query
        ResultSet resultSet = statement.executeQuery(
                "select Books.Book_ID,Book_Name,PublishDate from PublishDetail inner join Books on Books.Book_ID = PublishDetail.Book_ID where year(PublishDate) > 2008");

        while (resultSet.next()) {
            String bookID = resultSet.getString("Book_ID");
            String bookName = resultSet.getString("Book_Name");
            String pushlishDate = resultSet.getString("PublishDate");

            System.out.println("----------------");
            out.println("Book's Id:" + bookID);
            out.println("Book's Name:" + bookName);
            out.println("Book's publish date: " + pushlishDate);
        }

        connection.close();
    }

}
