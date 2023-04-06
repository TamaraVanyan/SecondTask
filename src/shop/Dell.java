package shop;

public class Dell extends Laptop {
    private String brand = "Dell";

    public Dell(String name, String model, int ram, double screenSize, double costPrice) {
        super(name, costPrice, model, ram, screenSize);
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void showDetails() {
        System.out.printf("Product Name: %s | Model: %s |Brand: %s | RAM: %dGB | Screen Size: %.1f |" +
                        "Selling Price: %.2f %n",
                getName(), getModel(), getBrand(), getRam(), getScreenSize(), marja(15.8));
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
