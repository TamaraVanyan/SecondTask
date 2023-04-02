package shop;

public class Laptop extends Product {
    private String model;
    private String brand;
    private int ram;
    private double screenSize;
    public Laptop(String name, double costPrice, double sellingPrice, String model, String brand, int ram, double screenSize) {
        super(name, costPrice, sellingPrice);
        this.model = model;
        this.brand = brand;
        this.ram = ram;
        this.screenSize = screenSize;
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

    public int getRam()  {
        return ram;
    }

    public void setRam(int ram) {
        if (ram < 2 || ram > 256) {
            System.out.println("Incredible size");
        } else {
            this.ram = ram;
        }
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (ram < 13.3 || ram > 17.3) {
            System.out.println("Incredible size");
        } else {
            this.screenSize = screenSize;
        }
    }
    @Override
    public void showDetails() {
        System.out.println("Product: " + getName() + " | Brand: " + getBrand() + " | Model: " + getModel() + " | RAM: " +
                getRam() + "GB | Screen size: " + getScreenSize());
    }
}