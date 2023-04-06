package shop;

public class Card {
    private double balance;
    private double totalRevenue = 0;
    private static int count;
    private int quantity;

    public Card(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double payWithCard(Product product) {
        double sellingPrice = product.getSellingPrice();
        double profit = product.calculateProfit();
        if (balance >= sellingPrice) {
            balance -= sellingPrice;
            totalRevenue += profit;
            count++;
            //product.setQuantity(product.getQuantity() - 1);

            System.out.println("Payment successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
        return totalRevenue;
    }
//public double payWithCard(Product product) {
//    double sellingPrice = product.getSellingPrice();
//    double profit = product.calculateProfit();
//    if (balance >= sellingPrice && product.getQuantity() > 0) {
//        balance -= sellingPrice;
//        totalRevenue += profit;
//        count++;
//        product.decreaseQuantity();
//        System.out.println("Payment successful!");
//    } else if (product.getQuantity() == 0) {
//        System.out.println("Out of stock: " + product.getName());
//    } else {
//        System.out.println("Insufficient balance!");
//    }
//    return totalRevenue;
//}

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public int getCount() {
        return count;
    }
}