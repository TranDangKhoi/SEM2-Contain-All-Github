package com.jbdcdemo.model;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jbdcdemo.entity.Product;

public interface ProductDao {
    public void createProduct(Product product) throws ClassNotFoundException, SQLException;

    public void updateProduct(Product product) throws ClassNotFoundException, SQLException;

    public ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException;

    public Product getProductById(int id);
}
