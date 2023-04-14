package trafic;

public class Trafic {
    public static void simulateTraffic(TraficLightsColor color) {
        switch(color) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Caution!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
            default:
                System.out.println("Invalid color.");
                break;
        }
    }
}
