public class Ankap {
    public static void main(String[] args) {

//        int a = 5;
//        int faktorial = 1;
//        while (a > 1) {
//            faktorial *= a;
//            a--;
//        }
//        System.out.println(faktorial);

//        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10};
//        int missing = 0;
//        for (int i = 0; i < array.length -1; i++) {
//            if (array[i+1] - array[i] != 1){
//                missing = array[i] + 1;
//                break;
//            }
//        }
//        System.out.println(missing);

//        int[] ansortedArr = {10, 15, 50, 3, 2, 0};
//        int min = ansortedArr[0];
//        for (int i = 0; i < ansortedArr.length; i++) {
//            if(ansortedArr[i] < min){
//                min = ansortedArr[i];
//            }
//        }
//        System.out.println(min);

//        int[] mixedArray = {10, 5, 7, 8, 1, 14, 3, 9, 12, 6};
//        int num = 15;
//        for (int i = 0; i < mixedArray.length - 1; i++) {
//            for (int j = 1; j < mixedArray.length; j++) {
//                if(mixedArray[i] + mixedArray[j] == num){
//                    System.out.println("Pair found at index " + i + " and " + j);
//                    System.out.println("(" + mixedArray[i] + ", " + mixedArray[j] + ")");
//                }
//            }
//        }

//        int[] array = {12, 7, 15, -3, 12, 8};
//        int index = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//           if(array[i] >= 0){
//               index++;
//           }
//        }
//        for (int i = index; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum);

        int inputNumber = 153;
        int length = 0;
        int current = 0;
        int resultSum = 0;

        while (inputNumber > 0) {
            current = inputNumber % 10;
            length++;
            inputNumber /= 10;
        }
        inputNumber = 153;
        while (inputNumber > 0) {
                current = inputNumber % 10;

                int resultMultypl = 1;
                while (length > 0) {
                    resultMultypl *= current;
                }
                resultSum += resultMultypl;
                inputNumber /= 10;
            }

        System.out.println(resultSum);
    }
}
