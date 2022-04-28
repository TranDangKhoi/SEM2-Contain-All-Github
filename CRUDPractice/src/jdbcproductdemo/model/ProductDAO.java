package jdbcproductdemo.model;

import java.sql.SQLException;
import java.util.ArrayList;

import jdbcproductdemo.entity.Product;

public interface ProductDAO {
    public void addNewProduct(Product product) throws ClassNotFoundException, SQLException;

    public void updateProduct(Product product) throws ClassNotFoundException, SQLException;

    public ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException;

    public void getProductById(int id);

    public void getProductsByName(String proName);

    public void deleteProduct(int id);

}
