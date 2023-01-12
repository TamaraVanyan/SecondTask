public class OddEvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr1 = {94, 63, 48, 69, 5, 0};
        int[] arr2 = {67, 77, 88, 53, 10, 21};
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1 && arr2[i] % 2 ==1) {
                result[i] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 ==0) {
                result[i] = arr2[i];
            } else {
                result[i] = 0;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
    }
}
