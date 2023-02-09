package FirstClassTask;

public class CharArray {
    public static void main(String[] args) {
        char[] input = {'g', 'a', 'g', 'o', '5'};
        int[] intArray = charToInt(input);
        char[] charArray = intToChar(intArray);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
            System.out.println(charArray[i] + " ");
        }
    }

    public static int[] charToInt(char[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        return result;
    }

    public static char[] intToChar(int[] input) {
        char[] result = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = (char) input[i];
        }
        return result;
    }
}
