package Lesson11;

import java.util.Arrays;

public class InsertSort {

    public static int[] insertSort(int[] array) {

        for (int i = 1; i < array.length ; ++i) {
           if (array[i - 1] > array[i]) {
                int temp = array[i];
                int j = i-1;
                while (j>=0 && temp < array[j]){
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, -6, 1, 2, -7, 9, 5, -4, 8};
        System.out.println(Arrays.toString(insertSort(array)));
    }
}
