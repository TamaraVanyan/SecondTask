package Bany;

public class MainChair {
    public static void main(String[] args) {
        Chair chair = new Chair(4, 30, 40);

        System.out.println("This chair has " + chair.getLegs() + " legs.");

        double area = chair.S();
        System.out.println("The area of the chair's seat is " + area + " square meters.");

        double perimeter = chair.P();
        System.out.println("The perimeter of the chair's seat is " + perimeter + " meters.");
    }
}
