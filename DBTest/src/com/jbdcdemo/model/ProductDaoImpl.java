package com.jbdcdemo.model;

import java.util.ArrayList;
import java.sql.*;

import com.jbdcdemo.dao.SQLServerConnection;
import com.jbdcdemo.entity.Product;

public class ProductDaoImpl implements ProductDao {

    @Override
    public void createProduct(Product product) throws ClassNotFoundException, SQLException {
        Connection conn = SQLServerConnection.getSQLServerConnection();
        Statement statement = conn.createStatement();
        String query = "insert into Products values (" + product.getId() + ",'" + product.getProductName() + "',"
                + product.getPrice() + ")";
        statement.executeUpdate(query);
    }

    @Override
    public void updateProduct(Product product) throws ClassNotFoundException, SQLException {
        Connection conn = SQLServerConnection.getSQLServerConnection();
    }

    @Override
    public ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException {
        Connection conn = SQLServerConnection.getSQLServerConnection();
        Statement statement = conn.createStatement();
        String query = "select * from Products";
        ResultSet resultset = statement.executeQuery(query);
        System.out.println("---All Products---");
        while (resultset.next()) {
            System.out.println(resultset.getInt("id"));
            System.out.println(resultset.getString("productName"));
            System.out.println(resultset.getDouble("price"));
        }

        return null;
    }

    @Override
    public Product getProductById(int id) {

        return null;
    }

}
