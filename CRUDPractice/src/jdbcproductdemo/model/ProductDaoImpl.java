package jdbcproductdemo.model;

import java.sql.*;
import java.util.ArrayList;

import jdbcproductdemo.dao.GetSQLConnection;
import jdbcproductdemo.entity.Product;

public class ProductDaoImpl implements ProductDAO {

    @Override
    public void addNewProduct(Product product) throws ClassNotFoundException, SQLException {
        Connection connection = GetSQLConnection.SQLServerConnection();
        String query = "insert into Products(productName,productDesc,price) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, product.getProName());
        preparedStatement.setString(2, product.getProDesc());
        preparedStatement.setDouble(3, product.getPrice());
        int rows = preparedStatement.executeUpdate();
        ResultSet keys = preparedStatement.getGeneratedKeys();
        if (keys.next()) {
            product.setId(keys.getInt(1));
        }

        System.out.println(rows);

    }

    @Override
    public void updateProduct(Product product) throws ClassNotFoundException, SQLException {
        Connection connection = GetSQLConnection.SQLServerConnection();
        String query = "update Products set productName = ?, productDesc = ?, price = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, product.getProName());
        preparedStatement.setString(2, product.getProDesc());
        preparedStatement.setDouble(3, product.getPrice());
        preparedStatement.setInt(4, product.getId());

        preparedStatement.executeUpdate();
    }

    @Override
    public ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException {
        Connection connection = GetSQLConnection.SQLServerConnection();
        ArrayList<Product> allProducts = new ArrayList<>();
        String query = "select * from Products";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt(1));
            product.setProName(resultSet.getString(2));
            product.setProDesc(resultSet.getString(3));
            product.setPrice(resultSet.getDouble(4));
            allProducts.add(product);
        }
        return allProducts;
    }

    @Override
    public void getProductById(int id) {

    }

    @Override
    public void getProductsByName(String proName) {

    }

    @Override
    public void deleteProduct(int id) {

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ProductDaoImpl productDaoImpl = new ProductDaoImpl();
        Product product = new Product(1, "Iphone XS Max", "100% Moi", 9000);
        productDaoImpl.addNewProduct(product);
    }
}
