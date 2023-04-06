package shop;

public class PanasonicTV extends TV {
    private String brand = "Panasonic";

    public PanasonicTV(String name, double costPrice, String model, double screenSize, boolean isSmart) {
        super(name, costPrice, model, screenSize, isSmart);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Brand: " + brand);
        super.showDetails();
    }

    @Override
    public double marja(double marja) {
        double per = (marja * getCostPrice()) / 100;
        double newSellingPrice = getCostPrice() + per;
        if (newSellingPrice < 0) {
            System.out.println("Selling price can't be negative");
            System.exit(2);
        }
        setSellingPrice(newSellingPrice);
        return newSellingPrice;
    }

    public double calculateProfit() {
        return getSellingPrice() - getCostPrice();
    }
}