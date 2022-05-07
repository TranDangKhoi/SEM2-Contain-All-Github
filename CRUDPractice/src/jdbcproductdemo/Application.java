package jdbcproductdemo;

import java.sql.SQLException;

import jdbcproductdemo.view.ProductConsole;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ProductConsole productConsole = new ProductConsole();
        productConsole.start();
    }

}
