package shop;

public class iPhone extends Mobile {
    private String brand = "iPhone";
    private String OS = "iOS";

    public iPhone(String name, String model, double costPrice) {
        super(name, model, costPrice);
    }

    public String getBrand() {
        return brand;
    }

    public String getOS() {
        return OS;
    }

    @Override
    public void showDetails() {
        double updatedSellingPrice = marja(20);
        System.out.printf("Mobile: %s | Brand: %s | Model: %s | OS: %s| Selling Price: %.2f%n", getName(), getBrand(), getModel(),
                getOS(), updatedSellingPrice);
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
