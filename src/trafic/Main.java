package trafic;

public class Main {
    public static void main(String[] args) {

        TraficLightsColor color = TraficLightsColor.RED;

        Trafic.simulateTraffic(color);

       // YourEnum.valueOf("VALUE").ordinal(); ES CHJOGECI INCHA INC TALIS
        TraficLightsColor.YELLOW.ordinal();
         Trafic.simulateTraffic(color);
    }
}