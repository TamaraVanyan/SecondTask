package shop;

public abstract class Mobile extends Product {
    private String model;

    public Mobile(String name, String model, double costPrice) {
        super(name, costPrice);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public double calculateProfit() {
        return getSellingPrice() - getCostPrice();
    }
}