public class ArrayOfPositiveNumbers {
    public static void main(String[] args) {
        double[] input = {10, -23.5, -8.7, 4.9, 15.07};
        double[] output = new double[input.length];

        int outIndex = 0;
        if (input[0] >= 0) {
            output[outIndex] = input[0];
            outIndex++;
        }
        if (input[1] >= 0) {
            output[outIndex] = input[1];
            outIndex++;
        }
        if (input[2] >= 0) {
            output[outIndex] = input[2];
            outIndex++;
        }
        if (input[3] >= 0) {
            output[outIndex] = input[3];
            outIndex++;
        }
        if (input[4] >= 0) {
            output[outIndex] = input[4];
            outIndex++;
        }
        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        System.out.println(output[3]);
        System.out.println(output[4]);
    }
}
