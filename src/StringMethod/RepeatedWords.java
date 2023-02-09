package StringMethod;

public class RepeatedWords {
    public static void main(String[] args) {
        System.out.println(wordCount("some some text", "some"));
        System.out.println(wordCount("some text", "bla"));
        System.out.println(wordCount("some text", ""));
        System.out.println(wordCount("string word repeated three time in this string type sentance like string"));
        System.out.println(wordCount(""));
        System.out.println(wordCount("some random text"));
    }

    public static int wordCount(String text, String word) {
        if (text.isEmpty() || word.isEmpty()) {
            return -2;
        }
        int count = text.split(word).length;
        if (count == 1) {
            return -1;
        } else {
            return count;
        }
    }

    public static int wordCount(String text) {
        return wordCount(text, "string");
    }
}