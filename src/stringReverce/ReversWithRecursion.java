package stringReverce;

public class ReversWithRecursion {
    public static void main(String[] args) {
        System.out.println(rev("barev ape jan"));
        System.out.println(rev("I am always hungry"));
        System.out.println(rev("ani and ina best friends"));
    }
    public static String rev(String text){
        if(text.length() <= 1 ){
            return text;
        }
        return text.charAt(text.length()-1) + rev(text.substring(0, text.length()-1));
    }
}
