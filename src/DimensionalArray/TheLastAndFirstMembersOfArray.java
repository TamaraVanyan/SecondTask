package DimensionalArray;
public class TheLastAndFirstMembersOfArray {
    public static void main(String[] arg){
        int [][] doubleArray = {{5, 8, -17, 1524}, {25, 67, 68, 69}, {0, 66, 77, 88, -67}};
        int firstElement = 0;
        int lastElement = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            firstElement = doubleArray[i][0];
            lastElement = doubleArray[i][doubleArray[i].length-1];
            System.out.println("First element: " + firstElement + "; Last element: " + lastElement);
        }
    }
}
