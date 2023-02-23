package sortedArray;

public class SortedNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {5, -23, 5, 12, -23, 5, 5, 5, -23, 12, -23, 12, 5, -23};
        int n;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }

        System.out.print("Sorted array in ascending Order: ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("}");
    }
}