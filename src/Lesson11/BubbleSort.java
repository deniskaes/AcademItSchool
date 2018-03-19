package Lesson11;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; ++i) {
            int countSwaps = 0;

            for (int j = 1; j < array.length - i; ++j) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    countSwaps++;
                }
            }
            if (countSwaps == 0) {
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, -6, 1, 2, -7, 9, 5, -4, -20,-20};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
