package shop;

public class Headphones extends Product {
    private String model;
    private String brand;
    private boolean isWireless;

    public Headphones(String name, String brand, double costPrice, double sellingPrice, String model, boolean isWireless) {
        super(name, costPrice, sellingPrice);
        this.model = model;
        this.brand = brand;
        this.isWireless = isWireless;
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

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
    @Override
    public void showDetails() {
        System.out.println("Product: " + getName() + " | Brand: " + getBrand() + " | Model: " + getModel() + " | Wireless: " +
                isWireless());
    }
}