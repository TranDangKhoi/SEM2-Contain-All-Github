package jdbcpracticaltest.model;

import java.sql.SQLException;
import java.util.ArrayList;

import jdbcpracticaltest.entity.Customer;

public interface CustomerDao {
    public void addNewCustomer(Customer customer) throws SQLException, ClassNotFoundException;

    public void findCustomerByName(String name);

    public ArrayList<Customer> showAllCustomers();
}
