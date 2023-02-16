package District;

public class Building {
    private String name;
    private int numOfFloors;
    private int numOfTwoRoomHouses;
    private int numOfThreeRoomHouses;
    private String type;

    public Building(String Name, int numOfFloors, int numOfTwoRoomHouses, int numOfThreeRoomHouses, String type) {
        this.name = name;
        this.numOfFloors = numOfFloors;
        this.numOfTwoRoomHouses = numOfTwoRoomHouses;
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

    public int getNumOfTwoRoomHouses() {
        return numOfTwoRoomHouses;
    }

    public int getNumOfThreeRoomHouses() {
        return numOfThreeRoomHouses;
    }

    public String getType() {
        return type;
    }
}