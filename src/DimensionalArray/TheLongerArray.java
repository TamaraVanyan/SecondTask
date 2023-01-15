package DimensionalArray;
public class TheLongerArray {
    public static void main(String[] args) {
         int[][] mixedArray = {{5, 15, 25, 35, 65},  {3, 8}, {-6, 66, 666}, {0, 8, 18}, {45, 88, 77, 99, 102, 1}, {152148}};
         int longerArray = mixedArray[0].length;
        System.out.print("The largest array in main array is: ");
         for (int i = 0; i < mixedArray.length; i++) {
            for (int j = 0; j < mixedArray[i].length; j++) {
                if(mixedArray[i].length > longerArray){
                    System.out.print(mixedArray[i][j] + " ");
                }
            }
        }
    }
}
