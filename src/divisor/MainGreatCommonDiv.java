package divisor;

public class MainGreatCommonDiv {
    public static void main(String[] args) {
        int[] numbers = {15, 100, 60, 75, 730};
        GreatestCommonDivisor greatestCommonDivisor1 = new GreatestCommonDivisor(numbers);
        System.out.println(greatestCommonDivisor1.findGreatestCommonDivisor());

        int[] numbers1 = {15, -102, 60, 75, 732};
        GreatestCommonDivisor greatestCommonDivisor2 = new GreatestCommonDivisor(numbers1);
        System.out.println(greatestCommonDivisor2.findGreatestCommonDivisor());

        int[] numbers2 = {1, 102, 0, 75, 732};
        GreatestCommonDivisor greatestCommonDivisor3 = new GreatestCommonDivisor(numbers2);
        System.out.println(greatestCommonDivisor3.findGreatestCommonDivisor());

    }
}
