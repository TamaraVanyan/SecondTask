package DimensionalArray;
public class TheLongerArray {
    public static void main(String[] args) {
         int[][] mixedArray = {{5, 15, 25, 35, 65},  {3, 8}, {-6, 66, 666}, {0, 8, 18}, {45, 88, 77, 99, 102, 1}, {152148}};
         int[] longerArray = mixedArray[0];
         for (int i = 0; i < mixedArray.length; i++) {
                if(mixedArray[i].length > longerArray.length){
                    longerArray = mixedArray[i];
                }
        }
        System.out.print("The largest array in main array is: ");
        for (int j = 0; j < longerArray.length;  j++) {
            System.out.print(longerArray[j] + " ");
        }
    }
}
