package jdbcpracticaltest.view;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

import jdbcpracticaltest.controller.CustomerController;
import jdbcpracticaltest.entity.Customer;

public class CustomerConsole {
    private final Scanner sc;
    CustomerController customerController = new CustomerController();
    Customer customer = new Customer();

    public CustomerConsole() {
        sc = new Scanner(System.in);
    }

    public int menu() {
        int choice;
        System.out.println("---Login Screen---");
        System.out.println("1. Add new customer");
        System.out.println("2. Find customers by name");
        System.out.println("3. Show all customers");
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
                e.printStackTrace();
            }
        }
    }

    public void start() throws ClassNotFoundException, SQLException {
        while (true) {
            int choice;
            choice = menu();
            switch (choice) {
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    findCustomerByName();
                    break;
                case 3:
                    showAllCustomers();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }

    }

    public void addNewCustomer() throws ClassNotFoundException, SQLException {
        System.out.print("Enter customer's name: ");
        String customerName = sc.nextLine();
        customer.setCustomerName(customerName);
        System.out.print("Enter customer's email: ");
        String customerEmail = sc.nextLine();
        customer.setCustomerEmail(customerEmail);
        System.out.print("Enter customer's phone number: ");
        String customerPhone = sc.nextLine();
        customer.setCustomerPhone(customerPhone);
        customerController.addNewCustomer(customer);
        System.out.println("Added successfully");
    }

    public void findCustomerByName() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customers = new ArrayList<>();
        System.out.print("Enter customer's name to find: ");
        String customerName = sc.nextLine();
        customers = customerController.findCustomerByName(customerName);
        System.out.println(customers);
    }

    public void showAllCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers = customerController.showAllCustomers();
        System.out.println(customers);
    }

}
