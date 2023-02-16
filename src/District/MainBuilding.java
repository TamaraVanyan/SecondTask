package District;

public class MainBuilding {
    public static void main(String[] args) {
        Building[] buildings = new Building[2];
        buildings[0] = new Building("Mozanbik", 4, 5, 3, "panel");
        buildings[1] = new Building("yxjiyazi", 6, 6, 8, "monolithic");
        District district = new District(buildings, 300);

        int unitGardenArea = district.getUnitGardenArea();
        System.out.println("Each house in the district has " + unitGardenArea + " square meters of garden area.");
    }
}