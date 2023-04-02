package shop;

import static shop.Product.count;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo ThinkPad", 800000, 950000, "T490", "Lenovo", 8, 14);
        TV tv1 = new TV("LG anun", 1000000, 1200000, "C1", "LG", 55, true);
        Mobile mobile = new Mobile("Samsung", 261000, 291000, "Galaksy S22", "Sasmsung");
        Headphones headphones1 = new Headphones("Bose QuietComfort 35", "MI", 30000, 40000, "Series II", true);

        laptop1.showDetails();
        laptop1.payWithCard(laptop1.getSellingPrice());
        tv1.showDetails();
        tv1.payWithCard(tv1.getSellingPrice());
        mobile.showDetails();
        headphones1.showDetails();
        headphones1.payWithCard(headphones1.getSellingPrice());
        //double totalRevenue = laptop1.calculateProfit() + tv1.calculateProfit() + mobile.calculateProfit() + headphones1.calculateProfit();
        System.out.println("Number of products sold։ " + count);
        System.out.println("Total revenue: " + Product.calculateTotalRevenue());
    }
}