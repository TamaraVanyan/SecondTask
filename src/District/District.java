package District;

public class District {
    private Building[] buildings;
    private int parkArea;

    public District(Building[] buildings, int parkArea) {
        this.buildings = buildings;
        if(parkArea > 0) {
            this.parkArea = parkArea;
        }else{
            System.out.println("area cannot be a negative number");
            System.exit(5);
        }
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public int getParkArea() {
        if (parkArea > 0) {
            return parkArea;
        } else {
            System.out.println("Park cant have negative area");
            System.exit(1);
        }
        return parkArea;
    }

    public double getUnitGardenArea() {
        double totalNumOfHouses = 0;
        for (int i = 0; i < buildings.length; i++) {
            totalNumOfHouses += buildings[i].getNumOfTwoRoomHouses().length  + buildings[i].getNumOfThreeRoomHouses().length;
        }
        return parkArea / (double) totalNumOfHouses;
    }
}
