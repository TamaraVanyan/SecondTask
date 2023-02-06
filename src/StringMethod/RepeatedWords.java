package StringMethod;

public class RepeatedWords {
    public static void main(String[] args) {
        System.out.println(wordCount("In this text this repeated two time", "this"));
        System.out.println(wordCount("some text", "bla"));
        System.out.println(wordCount("some text", ""));
        System.out.println(stringWordCount("string word repeated three time in this string type sentance like string"));
        System.out.println(stringWordCount(""));
        System.out.println(stringWordCount("some random text"));
    }
    public static int wordCount(String text, String word) {
        if (text.isEmpty() || word.isEmpty()) {
            return -2;
        }
        int count = text.split(word).length - 1;
        if (count == 0) {
            return -1;
        }
        return count;
    }
    public static int stringWordCount(String text) {
        if (text.isEmpty()) {
            return -2;
        }

        int count = text.split("string").length - 1;
        if (count == 0) {
            return -1;
        }
        return count;
    }
}