package Bany;

public class Task2B {
    public static void main(String[] args) {
        Task2A a = new Task2A();
        func(a, -8.8);
        System.out.println(a.x);
    }
    private static void func(Task2A a, double x){
        a = new Task2A();
        a.x = x;
    }
}
