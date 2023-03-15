package Bany;

public class Task3A {
    private int x;
    private static int y = 0;
    public Task3A (int x){
        y++;
        this.x = x;
    }
    public static void f(int i){
        y++;
       // g(i);
    }
    public void g(int j){
        System.out.println(j);
    }

}
