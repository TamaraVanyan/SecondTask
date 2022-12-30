public class Main {
    public static void main(String[] args) {
        //xndir 1_____________________________
        int x;
        int y;
        x = 64;
        y = 7;
        boolean t = true;
        boolean s = false;
        int result = x / y;
        if( y == 0){
            System.out.println("Cannot be divided by 0");
        }
        if (x == y * result) {
            System.out.println(t);
        }else{
            System.out.println(s);
        }

        //xndir 2________________________
        int a = 12, b = 15, c = 17;
        int d = 67, e = 5, f =42;
        double mijin1 = (a+b+c)/3D;
        double mijin2 = (d+e+f)/3D;
        int mijin = (int) ((mijin1 + mijin2)/2);
        System.out.println(mijin);

    }
}