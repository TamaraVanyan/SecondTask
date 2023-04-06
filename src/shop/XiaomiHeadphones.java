package shop;

public class XiaomiHeadphones extends Headphones {
    private int productCount = 100;

    public XiaomiHeadphones(String name, String model, boolean isWireless, double costPrice) {
        super(name, "Sony", costPrice, model, isWireless);
    }

    @Override
    public void showDetails() {
        System.out.printf("Product Name: %s | Model: %s | Wireless: %b | Selling Price: %.2f | Profit Margin: %.2f %n",
                getName(), getModel(), isWireless(), getSellingPrice(), marja(20));
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
