package shop;

public class Mobile extends Product {
    private String model;
    private String brand;

    public Mobile(String name, double costPrice, double sellingPrice, String model, String brand) {
        super(name, costPrice, sellingPrice);
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void showDetails() {
        System.out.println("Mobile: " + getName() + " | Brand: " + brand + " | Model: " + model  + " | Selling Price: " + getSellingPrice());
    }
}