package shop;

public class SimpleMobiles extends Mobile {
    private String brand;

    public SimpleMobiles(String name, String brand, String model, double costPrice) {
        super(name, model, costPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.printf("Mobile: %s | Brand: %s | Model: %s | Selling Price: %.2f%n", getName(), getBrand(), getModel(),
                getSellingPrice());
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
}
