package District;

public class Building {
    private String name;
    private int numOfFloors;
    private int[] numOfTwoRoomHouses;
    private int[] numOfThreeRoomHouses;
    private String type;

    public Building(String name, int numOfFloors, int[] numOfTwoRoomHouses, int[] numOfThreeRoomHouses, String type) {
        this.name = name;
        if (numOfFloors < 0) {
            System.out.println("Number of floors can't been negative");
            System.exit(1);
        } else {
            this.numOfFloors = numOfFloors;
        }
        for (int i = 0; i < numOfTwoRoomHouses.length; i++) {
            if (numOfTwoRoomHouses[i] <= 0) {
                System.out.println("Number of house can't negative number");
                System.exit(1);
            }
        }
        this.numOfTwoRoomHouses = numOfTwoRoomHouses;
        for (int i = 0; i <numOfThreeRoomHouses.length; i++) {
            if (numOfThreeRoomHouses[i] <= 0) {
                System.out.println("Number of house can't negative number");
                System.exit(1);
            }
        }
        this.numOfThreeRoomHouses = numOfThreeRoomHouses;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public int[] getNumOfTwoRoomHouses() {
        return numOfTwoRoomHouses;
    }

    public void setNumOfTwoRoomHouses(int[] numOfTwoRoomHouses) {
        this.numOfTwoRoomHouses = numOfTwoRoomHouses;
    }

    public int[] getNumOfThreeRoomHouses() {
        return numOfThreeRoomHouses;
    }

    public void setNumOfThreeRoomHouses(int[] numOfThreeRoomHouses) {
        this.numOfThreeRoomHouses = numOfThreeRoomHouses;
    }

    public String getType() {
        return type;
    }
}