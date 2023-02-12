package Sportsman;

public class Main {
    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman(70, 80, 90, 60);
        System.out.println("Collected points by sportsman1: " + sportsman1.collectedPoints());
        Sportsman sportsman2 = new Sportsman(80, 50, 70, 75);
        System.out.println("Collected points by sportsman2: " + sportsman2.collectedPoints());
        Sportsman sportsman3 = new Sportsman(20, 70, 75, 110);
        System.out.println("Collected points by sportsman3: " + sportsman3.collectedPoints());
    }
}
