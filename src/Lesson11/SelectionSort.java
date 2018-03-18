package Lesson11;

import java.util.Arrays;

public class SelectionSort {
    public static int indexMinElementArray(int[] a, int start) {

        int indexMinElement = start;
        int minElementArray = a[start];

        if (start == a.length - 1) {
            return indexMinElement;
        }
        for (int i = start; i < a.length; ++i) {
            if (minElementArray > a[i]) {
                minElementArray = a[i];
                indexMinElement = i;
            }
        }
        return indexMinElement;
    }

    public static int[] selectionSort(int[] a) {

        if (a.length <= 1) {
            return a;
        }

        for (int i = 0; i < a.length; ++i) {
            int indexMinElement = indexMinElementArray(a, i);
            if (i != indexMinElement) {
                int temp = a[i];
                a[i] = a[indexMinElement];
                a[indexMinElement] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {3, -6, 1, 2, -7, 9, 5, -4, 8};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
