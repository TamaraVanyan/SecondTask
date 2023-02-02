package DegreeOfNumber;

public class DegreeOfNumber {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        double power = power(5, -2);

        if (power == -2) {
            System.out.println("A is negative number");
        } else if (power == -1) {
            System.out.println("The abs of a is greater than 10");
        } else {
            System.out.println(power);
        }
    }

    static double power(int a, int b) {

        if (abs(a) > 10 || abs(b) > 10) {
            return -1;
        }
        if (a <= 0) {
            return -2;
        }

        double result = 1;

        for (int i = 1; i <= abs(b); i++) {
            result = result * a;
        }
        if (b < 0) {
            return 1 / result;
        }
        return result;
    }

    static int abs(int c) {
        if (c < 0) {
            return c * -1;
        }
        return c;
    }
}
