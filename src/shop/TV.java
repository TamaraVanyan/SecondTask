package shop;

public class TV extends Product {
    private String model;
    private double screenSize;
    private boolean isSmart;

    public TV(String name, double costPrice, String model, double screenSize, boolean isSmart) {
        super(name, costPrice);
        this.model = model;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
    public double calculateProfit() {
        return getSellingPrice() - getCostPrice();
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getName() + " | Model: " + getModel() + " | Screen size: " +
                getScreenSize() + " | Smart TV: " + isSmart() + " selling price: " + marja(8.5));
    }
}