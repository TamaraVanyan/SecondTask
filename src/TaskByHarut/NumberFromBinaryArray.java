package TaskByHarut;

public class NumberFromBinaryArray {
    public static void main(String[] args) {
        int[] binaryArray = {1, 0, 1, 0, 0, 1, 1, 0, 1, 0};
        int num = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            num = num * 2 + binaryArray[i];
        }
        System.out.println(num);
    }
}
