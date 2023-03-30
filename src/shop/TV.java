package shop;

public class TV extends Product {
    private String model;
    private String brand;
    private double screenSize;
    private boolean isSmart;

    public TV(String name, double costPrice, double sellingPrice, String model, String brand, double screenSize, boolean isSmart) {
        super(name, costPrice, sellingPrice);
        this.model = model;
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
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

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
    @Override
    public void showDetails() {
        System.out.println("Product: " + getName() + " | Brand: " + getBrand() + " | Model: " + getModel() + " | Screen size: " +
                getScreenSize() + " inches | Smart TV: " + isSmart());
    }
}