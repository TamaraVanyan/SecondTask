public class DecimalPart {
    public static void main(String[] args) {
        double a = 789.123;
        // 1in tarberak
        double decimalPart = a % 1;
        System.out.println("a tvi tasnordakan masn e " + decimalPart);
        // 2rd tarberak
        int x = (int)a;
        double result  = a - x;
        System.out.println(result);
        if(false){
            System.out.println("hu");
        }

        //gitem vor sran hly shat ka bayc grel em :D______
        String str = Double.toString(a);
        String[] parts = str.split("\\.");
        System.out.println("0." + parts[1]);
    }
}
