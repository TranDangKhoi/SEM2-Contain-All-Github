package jdbcproductdemo.controller;

import jdbcproductdemo.entity.Product;
import jdbcproductdemo.model.ProductDaoImpl;

import java.sql.*;

public class ProductController {
    ProductDaoImpl productDaoImpl = new ProductDaoImpl();

    public void addNewProduct(Product product) throws ClassNotFoundException, SQLException {
        productDaoImpl.addNewProduct(product);
    }
}
