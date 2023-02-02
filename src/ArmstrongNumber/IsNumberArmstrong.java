package ArmstrongNumber;

public class IsNumberArmstrong {
    public static void main(String[] args) {
        boolean result1 = isArmstrong(153);
        System.out.println(result1);
        boolean result2 = isArmstrong(1538);
        boolean result3 = isArmstrong(7);
    }

    public static int getLength(int number) {
        int length = 0;
        while (number > 0) {
            length++;
            number /= 10;
        }
        return length;
    }

    public static boolean isArmstrong(int number) {
        int inputNumber = number;
        int length = getLength(number);
        int current = 0;
        int resultSum = 0;
        while (inputNumber > 0) {
            current = inputNumber % 10;
            int resultMultypl = 1;
            for (int i = 0; i < length; i++) {
                resultMultypl *= current;
            }
            resultSum += resultMultypl;
            inputNumber /= 10;
        }
        if (resultSum == number) {
            System.out.println(number + " is armstrong number․");
            return true;
        } else {
            System.out.println(number + " is not armstrong number․");
            return false;
        }
    }
}