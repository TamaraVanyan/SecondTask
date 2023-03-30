package shop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo ThinkPad", 800, 1200, "T490", "Lenovo", 8, 14);
        TV tv1 = new TV("LG OLED", 1000, 1500, "C1", "LG", 55, true);
        Headphones headphones1 = new Headphones("Bose QuietComfort 35", "MI", 300, 400, "Series II", true);

        laptop1.showDetails();
        tv1.showDetails();
        headphones1.showDetails();
    }
}
