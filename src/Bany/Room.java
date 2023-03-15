package Bany;

public class Room {
    private double length;
    private double width;
    private double height;
    private int countOfChairs;

    public Room(double length, double width, double height, int count) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.countOfChairs = count;
    }

    public int getNumChairs() {
        return this.countOfChairs;
    }

    public void setCountOfChairs(int countOfChairs) {
        if(countOfChairs == 0){
            System.out.println("In the room there is not any chairs");
        }
        this.countOfChairs = countOfChairs;
    }
}