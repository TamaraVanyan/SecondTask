package DegreeOfNumber;
public class DegreeOfNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int result1 = power(2, 5);
        System.out.println(result1);
        int result2 = power(-2, 5);
        System.out.println(result2);
        int result3 = power(2, -5);
        System.out.println(result3);
        int result4 = power(22, 45);
        System.out.println(result4);
        int result5 = power(5, 4);
        System.out.println(result5);
    }

    public static int power(int a, int b) {
        if (a <= 0 || b < 0) {
            System.out.print("a = " + a + " and " + "b = " + b + " must be positive. ");
            return -2;
        }
        if (Math.abs(a) > 10 || Math.abs(b) > 10) {
            System.out.print("b must be less than or equal to 10. ");
            return -1;
        }
        int result = 1;
        if(a > 0 && a < 10 && b >= 0 && b <= 10) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            System.out.print("The power " + b + " of " + a + " number is: ");
        }
        return result;
    }
}
