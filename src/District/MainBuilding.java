package District;

public class MainBuilding {
    public static void main(String[] args) {
        Building[] buildings = new Building[2];
        buildings[0] = new Building("Mozanbik", 5, new int[] {5, 7, 9, 13, 15},
                new int[]{3, 10, 13, 23, 7 }, "panel");
        buildings[1] = new Building("yxjiyazi", 6, new int[]{6, 12, 18, 14},
                new int[]{2, 4, 8, 10, 12}, "monolithic");
        District district = new District(buildings, 300);

        double unitGardenArea = district.getUnitGardenArea();
        System.out.println("Each house in the district has " + unitGardenArea + " square meters of garden area.");

        Building[] buildings1 = new Building[3];
        buildings1[0] = new Building("bla", 2, new int[] {5, 7, 9, 13, 15},
                new int[]{3, 10, 13, 23, 7 }, "panel");
        buildings1[1] = new Building("bla bla", 4, new int[]{6, 14},
                new int[]{2, 4, 8, 10, 12}, "monolithic");
        buildings1[2] = new Building("bla bla nla", 16, new int[]{6, 12, 18, 14},
                new int[]{2, 4, 8, 12}, "monolithic");
        District district1 = new District(buildings1, 2000);

        double unitGardenArea1 = district1.getUnitGardenArea();
        System.out.println("Each house in the district has " + unitGardenArea1 + " square meters of garden area.");
    }
}