import java.util.Scanner;
public class MinutesOfClock {
    public static void main(String[] args) {
        System.out.println("Type the number for the minute hand position։ ");
        Scanner sc = new Scanner(System.in);
        int minutePosition = sc.nextInt();
        sc.close();
        if(minutePosition > 0 && minutePosition <12) {
            System.out.println("It's " + minutePosition * 5 + " minute");
        }
        if(minutePosition == 12){
            System.out.println("It is round hour");
        }else{
            System.out.println("The entered number is outside the range of clockwise numbers");
            System.exit(1);
        }
    }
}
