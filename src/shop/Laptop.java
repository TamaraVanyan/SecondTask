package shop;

public abstract class Laptop extends Product {
    private String model;
    private int ram;
    private double screenSize;

    public Laptop(String name, double costPrice, String model, int ram, double screenSize) {
        super(name, costPrice);
        this.model = model;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getRam() {
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
    public double calculateProfit() {
        return getSellingPrice() - getCostPrice();
    }
}