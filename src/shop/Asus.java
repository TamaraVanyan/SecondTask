package shop;

public class Asus extends Laptop {
    private String brand = "Asus";

    public Asus(String name, String model, int ram, double screenSize, double costPrice) {
        super("Acer", costPrice, model, ram, screenSize);
    }

    @Override
    public void showDetails() {
        System.out.printf("Product Name: %s | Model: %s | RAM: %dGB | Screen Size: %.1f inch|Cost Price: %.2f USD|" +
                        "Selling Price: %.2f %n",
                getModel(), getName(), getRam(), getScreenSize(), getCostPrice(), marja(18.5));
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
