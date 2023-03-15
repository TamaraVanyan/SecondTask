package Bany;

public class MainRoom {
    public static void main(String[] args) {
        Room room1 = new Room(4.0, 5.0, 3.0, 2);

        System.out.println("Room 1 has " + room1.getNumChairs() + " chairs.");

        Room room2 = new Room(4.8, 5.9, 2.5, 0);

        System.out.println("Room 2 has " + room2.getNumChairs() + " chairs.");
    }
}
