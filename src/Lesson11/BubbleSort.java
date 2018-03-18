package Lesson11;

import java.util.Arrays;

public class BubbleSort {

    public static void swapNeighboringElements(int[] array, int a, int b) {

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int[] bubbleSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        for (int i = 0; i < array.length - 1; ++i) {
            int countSwaps = 0;
            for (int j = 1; j < array.length - i; ++j) {
                if (array[j - 1] > array[j]) {
                    swapNeighboringElements(array, j - 1, j);
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
        int[] array = {1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
