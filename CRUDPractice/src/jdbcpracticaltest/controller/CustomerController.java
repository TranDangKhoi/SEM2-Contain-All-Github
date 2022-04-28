package jdbcpracticaltest.controller;

import java.util.ArrayList;
import java.sql.*;

import jdbcpracticaltest.entity.Customer;
import jdbcpracticaltest.model.CustomerDaoImpl;

public class CustomerController {
    CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();

    public void addNewCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        customerDaoImpl.addNewCustomer(customer);
    }

    public ArrayList<Customer> findCustomerByName(String name) throws ClassNotFoundException, SQLException {
        return customerDaoImpl.findCustomerByName(name);
    }

    public ArrayList<Customer> showAllCustomers() throws ClassNotFoundException, SQLException {
        return customerDaoImpl.showAllCustomers();
    }
}
