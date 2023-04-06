package shop;

public abstract class Headphones extends Product {
    private String model;
    private boolean isWireless;

    public Headphones(String name, String brand, double costPrice, String model, boolean isWireless) {
        super(name, costPrice);
        this.model = model;
        this.isWireless = isWireless;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public double calculateProfit() {
        return getSellingPrice() - getCostPrice();
    }
}