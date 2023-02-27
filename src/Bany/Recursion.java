package Bany;

public class Recursion {
    public static void main(String[] args) {
        String n = "kakadu";
        System.out.println(rev(n));
        int index = 3;
        System.out.println(fib(index));
        int index1 = 5;
        System.out.println(fib(index1));
        System.out.println("______________");
        int num = 5;
        System.out.println(pre(num));
    }

    public static String rev(String n) {
        if (n.length() <= 1) {
            return n;
        }
        return n.charAt(n.length() - 1) + rev(n.substring(0, n.length() - 1));
    }

    public static int fib(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return fib(index - 1) + fib(index - 2);
    }

    public static int pre(int n) {
        int k = 0;
        if (n == 1) {
            System.out.println(1);
            return n;
        }
        if (n > 1) {
            k = pre(n - 1);
            System.out.println(n);
        }
        return k;
    }
}
