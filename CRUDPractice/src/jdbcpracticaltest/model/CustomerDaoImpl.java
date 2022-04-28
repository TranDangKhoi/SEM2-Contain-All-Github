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

        System.out.println(rows);
    }

    @Override
    public void findCustomerByName(String name) {

    }

    @Override
    public ArrayList<Customer> showAllCustomers() {

        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
        Customer customer = new Customer(1, "Vin Diesel", "vindiesel12@gmail.com", "988323245");
        customerDaoImpl.addNewCustomer(customer);
    }

}
