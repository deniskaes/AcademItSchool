package Lesson11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {

    public static int[] insertSort(int[] array) {

        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] > array[i]) {
                int temp = array[i];
                int j = i-1;
                while (j>0 && temp < array[j]){}
//                while (j > 0 && array[j - 1] > array[j]) {
//                    int temp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = temp;
//                    j--;
//                }

            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, -6, 1, 2, -7, 9, 5, -4, 8};
        System.out.println(Arrays.toString(insertSort(array)));
    }
}
