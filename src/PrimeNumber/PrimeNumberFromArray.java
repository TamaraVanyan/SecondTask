package PrimeNumber;
public class PrimeNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 1, 7, 10, 11, 0, 47, 99};
        //int[] arr = {4, 8, 6};
        int num = 0;
        boolean isPrime = false;
        for (int i = 0; i < arr.length; i++) {
            isPrime = true;
            if (arr[i] == 1 || arr[i] == 0) {
                isPrime = false;
            } else {
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(arr[i] + " ");
                isPrime = true;
                num++;
            }
        }
        if (num == 0) {
            System.out.println("No prime numbers found in the array.");
        }
    }
}

