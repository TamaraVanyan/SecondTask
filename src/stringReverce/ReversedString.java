package stringReverce;

public class ReversedString {
    public static void main(String[] args) {

        System.out.println(reverseString("barev apeh jan"));
        System.out.println(reverseString("hinsh ka chka"));
    }

    public static String reverseString(String str) {
        char charArr[] = str.toCharArray();
        String rev = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            rev += charArr[i];
        }
        return rev;
    }
}
