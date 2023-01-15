public class Factoryal {
    public static void main(String[] args) {
//        int n = 4;
//        int index = 0;
//        if (index == 1 || index == 2){
//            n = 1;
//        }else{
//            for(int i = 0; i < index; i++){
//                 n = (index-1) + (index - 2);
//            }
//        }
//        System.out.println(n);
//        int a = 1;
//        int b = 1;
//        int c;
//        int n = 5;
//        for(int i = 2; i <= n; i++){
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        System.out.println(c);
        int[] array = {4, 1, 4, 3, 5, 1};
        int num = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > num){
                num = array[i];
            }
        }
       // System.out.println(num);
        int[] array1 = new int[num];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array[i] == array[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        }
    }