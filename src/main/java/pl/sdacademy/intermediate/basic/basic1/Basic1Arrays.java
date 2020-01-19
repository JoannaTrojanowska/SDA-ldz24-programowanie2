package pl.sdacademy.intermediate.basic.basic1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Basic1Arrays {
    public static void main(String[] args) {

        int[] ints = initIntsArray(10);
        int[] fibonacci = initFibonacciArray(10);
        int[] random = initRandomArray(10);

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(fibonacci));
        System.out.println(Arrays.toString(random));

//      Arrays.stream(ints)
//                .sorted(Comparator.reverseOrder().)
//                .map()
//                .collect(Collectors.toList());


    }


    public static int[] initIntsArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }


    public static int[] initFibonacciArray(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < size; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }


    public static int[] initRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i]=random.nextInt(30 - 5) + 5;
        }
        return array;
    }
}
