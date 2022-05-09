package Core;

public class Checklist {

    String productName;
    String brand;
    Double cost;
    String location;
    Double inCart;

    public Checklist(String productName, String brand, Double cost, String location, Double inCart) {
        this.productName = productName;
        this.brand = brand;
        this.cost = cost;
        this.location = location;
        this.inCart = inCart;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getInCart() {
        return inCart;
    }

    public void setInCart(Double inCart) {
        this.inCart = inCart;
    }
}
