package OldTasks;
import java.util.Scanner;
public class FindLetterInArray {
    public static void main(String[] args) {
        char[] array = {'a', 'n', 'd', 'o', 'r', 'a', 'f', 'o', 'm', 'k'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        int index = -1;
        int i = 0;
        while (i < array.length) {
            if (array[i] == letter) {
                index = i;
                break;
            }
            i++;
        }
        if (index != -1) {
            System.out.println("Letter found at index: " + index);
        } else {
            System.out.println("Letter not found in the array");
        }
    }
}
