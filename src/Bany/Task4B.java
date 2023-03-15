package Bany;

public class Task4B {
    public static void main(String[] args) {
        Task4A a = new Task4A();
        final Task4A b = a;
        b.x = 1500;
        System.out.println(a.x);

    }
}
