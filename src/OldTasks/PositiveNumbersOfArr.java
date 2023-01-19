package OldTasks;
public class PositiveNumbersOfArr {
        public static void main(String[] args) {
            int[] mixedNumbers = {-77, 4, -69, 2, 57, 8, -3};
            int changes = 0;
            System.out.print("Resulting Array: ");
            for (int i = 0; i < mixedNumbers.length; i++) {
                if (mixedNumbers[i] < 0) {
                    mixedNumbers[i] = -1 * mixedNumbers[i];
                    changes++;
                }
                System.out.print(mixedNumbers[i] + "; ");
            }
            System.out.println("Number of Changes: " + changes);
            System.out.println("Number of Non-negative Members: " + (mixedNumbers.length -  changes));
        }
 }
