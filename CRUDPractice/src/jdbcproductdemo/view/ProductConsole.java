package jdbcproductdemo.view;

import java.sql.SQLException;
import java.util.Scanner;

import jdbcproductdemo.controller.ProductController;
import jdbcproductdemo.entity.Product;

public class ProductConsole {
    private final Scanner sc;
    ProductController productController = new ProductController();
    Product product = new Product();

    public ProductConsole() {
        sc = new Scanner(System.in);
    }

    public int menu() {
        int choice;
        System.out.println("---Login Screen---");
        System.out.println("1. Add a new product");
        System.out.println("2. Update a product");
        System.out.println("3. Get all products");
        System.out.println("4. Exit program");
        choice = readInt(1, 4);
        return choice;
    }

    public int readInt(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    throw new NumberFormatException("Please enter a valid number");
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void start() throws ClassNotFoundException, SQLException {
        while (true) {
            int choice;
            choice = menu();
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                default:
                    break;
            }
        }

    }

    public void addNewProduct() throws ClassNotFoundException, SQLException {
        int id = 1;
        product.setId(id);
        System.out.print("Enter product's name: ");
        String productName;
        productName = sc.nextLine();
        product.setProName(productName);
        String productDesc;
        System.out.print("Enter product's description: ");
        productDesc = sc.nextLine();
        product.setProDesc(productDesc);
        double price;
        System.out.print("Enter product's price: ");
        price = sc.nextDouble();
        product.setPrice(price);
        productController.addNewProduct(product);
    }
}
