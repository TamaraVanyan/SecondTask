package shop;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(10000000);
        iPhone iphone = new iPhone("iPhone 12", "12 Pro Max", 800000);
        iphone.showDetails();
        card.payWithCard(iphone);
        Samsung SamsungA32 = new Samsung("Samsung", "Galaxy A 52", 360000);
        SamsungA32.showDetails();
        card.payWithCard(SamsungA32);

        Acer acer = new Acer("Aspire 5", 8, 15.6, 500);
        acer.showDetails();
        Dell dell = new Dell("Dell chgitem inch", "Core i7", 16, 15.5, 720000);
        dell.showDetails();
        Asus asus = new Asus("Asus zzvanq", "Core i5", 8, 15.5, 360000);
        asus.showDetails();
        card.payWithCard(asus);

        Headphones sonyHeadphones = new Sony("Sony WH-1000XM4", "Sony", true, 67000);
        sonyHeadphones.showDetails();
        card.payWithCard(sonyHeadphones);

        PanasonicTV panasonicTV = new PanasonicTV("Panasonic Smart TV", 520000, "1234", 55.0, true);
        panasonicTV.showDetails();
        card.payWithCard(panasonicTV);
        LGTV lgTV = new LGTV("LG OLED65C1PVA", 2000000, "OLED65C1PVA", 65, true);
        lgTV.showDetails();
        card.payWithCard(lgTV);

        System.out.println("Number of products sold։ " + card.getCount());
        System.out.println("Sop total revenue: " + card.getTotalRevenue());
    }
}