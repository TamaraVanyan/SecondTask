package shop;

public abstract class Product {
    private String name;
    private double costPrice;
    private double sellingPrice;
    private int quantity;

    public Product(String name, double costPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public abstract void showDetails();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity() {
        quantity--;
        if (quantity == 0) {
            System.out.println("Out of stock: " + name);
        }
    }

    public double marja(double marja) {
        double per = (marja * getCostPrice()) / 100;
        sellingPrice = getCostPrice() + per;
        if (sellingPrice < 0) {
            System.out.println("Selling prise can't bee negative");
            System.exit(2);
        }
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {

        return sellingPrice;
    }

    public double calculateProfit() {
        return getSellingPrice() - getCostPrice();
    }
}