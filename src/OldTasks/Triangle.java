package OldTasks;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle");
        System.out.println("Enter a: ");
        int a = myObj.nextInt();
        System.out.println("Enter b: ");
        int b = myObj.nextInt();
        System.out.println("Enter c: ");
        int c = myObj.nextInt();
        //erkarutyuny chi karox linel bacasakan tiv
        if(a < 0 || b < 0 || c < 0){
            System.out.println("The length of the side of a triangle cannot be a negative number");
            System.exit(1);
        }
        // erankyan 2 koxmeri gumary misht mec e errord koxmic
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Triangle is possible");
        } else {
            System.out.println("Triangle is not possible");
        }
    }
}