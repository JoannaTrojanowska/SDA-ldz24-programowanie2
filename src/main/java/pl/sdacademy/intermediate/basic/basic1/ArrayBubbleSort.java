package pl.sdacademy.intermediate.basic.basic1;

public class ArrayBubbleSort {

    static int[] bubbleSort(int[] array) {
        int lenght = array.length;
        int temp;

        for (int i = 0; i < lenght; i++)
            for (int j = 1; j < lenght - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
    return array;
    }

}
