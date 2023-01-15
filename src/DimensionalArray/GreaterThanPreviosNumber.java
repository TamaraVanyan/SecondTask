package DimensionalArray;
public class GreaterThanPreviosNumber {
    public static void main(String[] args) {
        int[] integersArray = {45, 2, 0, 67, -8, 45, 65, 77, 8, -9, -3, -2, 12, 0, 68, 47, 54, 22, 12, 33, 5};
        int count = 0;
        for (int i = 0; i < integersArray.length -1; i++) {
            if(integersArray[i] < integersArray[i + 1]){
                count++;
            }
        }
        System.out.println("The count of number that greather than previos number is: " + count);
    }
}
