package sortedArray;

public class SortedNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {5, -23, 5, 12, -23, 5, 5, 5, -23, 12, -23, 12, 5, -23};
        int n = arr.length;
        int n23 = 0;
        int n5 = 0;
        int n12 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == -23) {
                n23++;
            }
            if (arr[i] == 5) {
                n5++;
            }
            if (arr[i] == 12) {
                n12++;
            }

        }
        System.out.print("{");
        for (int i = 0; i < n23; i++) {
            System.out.print(-23 + ", ");
        }
        for (int i = 0; i < n5; i++) {
            System.out.print(5 + ", ");
        }
        for (int i = 0; i < n12; i++) {
            System.out.print(12 + ", ");
        }
        System.out.println("}");
    }
}
