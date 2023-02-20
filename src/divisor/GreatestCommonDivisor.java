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
    public int findGreatestCommonDivisor() {
        int greatcommondiv = arrayOfNumbers[0];
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            greatcommondiv  = findGreatCommonDiv(greatcommondiv, arrayOfNumbers[i]);
        }
        return greatcommondiv ;
    }
    private int findGreatCommonDiv(int a, int b) {
        int next;
        while (b != 0) {
            next = b;
            b = a % b;
            a = next;
        }
        return a;
    }
}