package pl.sdacademy.intermediate.warmup.warmup3;

public class WarmUp3 {
    public static void main(String[] args) {


        int[] array = new int[]{-2, 3, 1, 23, -9, 0, 12, 6, -4};
        int max = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);


        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);


    }
}
