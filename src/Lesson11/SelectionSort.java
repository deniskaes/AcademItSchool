package Lesson11;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; ++i) {
            int minElementIndex = i;
            int minElementArray = array[i];

            for (int j = i + 1; j < array.length; ++j) {
                if (minElementArray > array[j]) {
                    minElementArray = array[j];
                    minElementIndex = j;
                }
            }
            array[minElementIndex] = array[i];
            array[i] = minElementArray;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, -6, 1, 2, -7, 9, 5, -4, -20};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
