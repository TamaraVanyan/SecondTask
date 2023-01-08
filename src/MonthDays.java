import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month number in range 1 to 12: ");
        int month = scanner.nextInt();
        int days = 0;
        //erkrord tarberak__________________________
        if (1 <= month && month <= 12) {
            if (year % 4 != 0) {
                switch (month) {
                    case 2:
                        days = 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                }
            } else {
                switch (month) {
                    case 2:
                        days = 29;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                }
            }
        } else {
            System.out.println("Invalid month number");
            System.exit(1);
        }
        System.out.println("Month " + month + " has " + days + " days");
    }
}
