package shop;

public abstract class Product {
    private String name;
    private double costPrice;
    private double sellingPrice;
    private double balance = 10000000;
    public static int count = 0;
    public static double totalRevenue = 0;

    public Product(String name, double costPrice, double sellingPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
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

    public double getSellingPrice() {
        if (sellingPrice < 0) {
            System.out.println("Selling prise can't bee negative");
            System.exit(2);
        }
        return sellingPrice;

    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public abstract void showDetails();

    public double payWithCard(double sellingPrice) {
        double profit = sellingPrice - costPrice;
        if (balance >= sellingPrice) {
            balance -= sellingPrice;
            totalRevenue += profit;
            count++;
            System.out.println("Payment successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
        return profit;
    }
    public static double calculateTotalRevenue() {
        return totalRevenue;
    }
}