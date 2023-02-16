package Sportsman;

class Main {
    public static void main(String[] args) {
        int[] sportsmen1 = {50, 70, 55, 85};
        Sportsman sportsman1 = new Sportsman(sportsmen1);
        System.out.println("Average points of sportsmen1: " + sportsman1.collectedPoints());

        int[] sportsmen2 = {90, 55, 70, 82, 97};
        //int[] sportsmen2 = {50, 70, 55, 85};
        Sportsman sportsman2 = new Sportsman(sportsmen2);
        System.out.println("Average points of sportsmen2: " + sportsman2.collectedPoints());

        int comparisonResult = sportsman1.compareAverages(sportsman2);

        int[] sportsmen3 = {90, 55, 49, 82, 97};
        Sportsman sportsman3 = new Sportsman(sportsmen3);
        System.out.println("Average points of sportsmen3: " + sportsman3.collectedPoints());

    }
}
