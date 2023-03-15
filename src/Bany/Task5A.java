package Bany;

public class Task5A {
    private String a;
    private int b;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(int b) {
        if (b >= 0 && b <= 100) {
            System.out.println(String.format("Bad number is . " + b));
        } else {
            this.b = b;
        }
    }

    public void increaseB(int i) {
        b += i;
    }
    public int getB(){
        return b;
    }
}