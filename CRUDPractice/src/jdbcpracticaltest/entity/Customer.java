package jdbcpracticaltest.entity;

public class Customer {
    private int id;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Customer() {

    }

    public Customer(int id, String customerName, String customerEmail, String customerPhone) {
        this.id = id;
        this.customerName = customerEmail;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
