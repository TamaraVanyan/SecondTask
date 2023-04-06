package shop;

public class Samsung extends Mobile{
    private String brand = "Samsung";
    private String OS = "Android";
    double newSellingPrice;
    public Samsung(String name, String model, double costPrice) {
        super(name, model, costPrice);
    }

    public String getOS() {
        return OS;
    }
    public String getBrand(){
        return brand;
    }

    @Override
    public void showDetails() {
        //System.out.println("Mobile: " + getName() + " | Brand: " + brand + " | Model: " + model  + " | Selling Price: " + getSellingPrice());
        System.out.printf("Mobile: %s | Brand: %s | Model: %s | OS: %s| Selling Price: %.2f%n", getName(), getBrand(), getModel(),
                getOS(), marja(16.7));
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
