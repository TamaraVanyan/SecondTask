package divisor;

public class GreatestCommonDivisor {
    private int [] arrayOfNumbers;

    public GreatestCommonDivisor(int[] arrayOfNumbers){
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] == 0){
                System.out.println("Remove 0 from array");
                System.exit(3);
            }
        }
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public int[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }

    public void setArrayOfNumbers(int[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public int findGreatestCommonDivisor() {
        int greatcommondiv = findMin(arrayOfNumbers);
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            greatcommondiv  = findGreatCommonDiv(greatcommondiv, arrayOfNumbers[i]);
        }
        return greatcommondiv;
    }
    private int findGreatCommonDiv(int a, int b) {
        int current;
        while (b != 0) {
            current = b;
            b = a % b;
            a = current;
        }
        return a;
    }
}