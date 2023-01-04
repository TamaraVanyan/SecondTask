import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();

        // erankyan 2 koxmeri gumary misht mec e errord koxmic
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Triangle is possible");
        } else {
            System.out.println("Triangle is not possible");
        }
    }
}