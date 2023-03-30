package Bany;

public class MinMaxInArr {
    public static void main(String[] args) {
//        int size = 8;
//        int[] array = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            array[i] = (int) (Math.random() * 100);
//        }
//
//        int max = array[0];
//        int min = array[0];
//        int sum = array[0];
//        for (int i = 1; i < size; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
//            sum += array[i];
//        }
//        int avg = sum / size;
//
//        System.out.print("Array: [");
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i]);
//            if (i < size - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);
//        System.out.println("Average value: " + avg);
//        System.out.print("In range 0 to 100 prime numbers are: ");
//        for (int i = 2; i < 100; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= i/2; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(i + ", ");
//            }
//        }

        char[] chars = {'j', 'a', 'v', 'a', ' ', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (char ch : chars) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println("The count of " + c + " is: " + count);
    }
}
