package jdbcproductdemo.entity;

public class Product {
    private int id;
    private String proName;
    private String proDesc;
    private double price;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return this.proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDesc() {
        return this.proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {

    }

    public Product(int id, String proName, String proDesc, double price) {
        this.id = id;
        this.proName = proName;
        this.proDesc = proDesc;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", proName='" + getProName() + "'" +
                ", proDesc='" + getProDesc() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

}
