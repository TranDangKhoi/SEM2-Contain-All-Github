package jdbcpracticaltest.model;

import java.util.ArrayList;
import java.sql.*;

import jdbcpracticaltest.dao.SQLServerConnection;
import jdbcpracticaltest.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void addNewCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        String query = "insert into Customer(customerName,customerEmail,customerPhone) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, customer.getCustomerName());
        preparedStatement.setString(2, customer.getCustomerEmail());
        preparedStatement.setString(3, customer.getCustomerPhone());
        int rows = preparedStatement.executeUpdate();
        ResultSet keys = preparedStatement.getGeneratedKeys();
        if (keys.next()) {
            customer.setId(keys.getInt(1));
        }

        System.out.println("Added" + rows + "new employee");
    }

    @Override
    public ArrayList<Customer> findCustomerByName(String name) throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        ArrayList<Customer> allCustomerName = new ArrayList<>();
        String query = "select * from Customer where customerName = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Customer customer = new Customer();
            customer.setId(resultSet.getInt(1));
            customer.setCustomerName(resultSet.getString(2));
            customer.setCustomerEmail(resultSet.getString(3));
            customer.setCustomerPhone(resultSet.getString(4));
            allCustomerName.add(customer);
        }
        return allCustomerName;
    }

    @Override
    public ArrayList<Customer> showAllCustomers() throws ClassNotFoundException, SQLException {
        Connection connection = SQLServerConnection.getSQLServerConnection();
        ArrayList<Customer> allCustomers = new ArrayList<>();
        String query = "select * from Customer";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Customer customer = new Customer();
            customer.setId(resultSet.getInt(1));
            customer.setCustomerName(resultSet.getString(2));
            customer.setCustomerEmail(resultSet.getString(3));
            customer.setCustomerPhone(resultSet.getString(4));
            allCustomers.add(customer);
        }
        return allCustomers;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
        ArrayList<Customer> customers = new ArrayList<>();
        customers = customerDaoImpl.showAllCustomers();
        System.out.println(customers);
    }

}
