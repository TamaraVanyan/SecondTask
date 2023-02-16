package District;

public class District {
    private Building[] buildings;
    private int parkArea;

    public District(Building[] buildings, int parkArea) {
        this.buildings = buildings;
        this.parkArea = parkArea;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public int getParkArea() {
        return parkArea;
    }
    public int getUnitGardenArea() {
        int totalNumOfHouses = 0;
        for (int i = 0; i < buildings.length; i++) {
            totalNumOfHouses += buildings[i].getNumOfTwoRoomHouses() + buildings[i].getNumOfThreeRoomHouses();
        }
        return parkArea / totalNumOfHouses;
    }
}
