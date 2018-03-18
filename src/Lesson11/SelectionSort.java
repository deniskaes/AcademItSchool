package Lesson11;

public class SelectionSort {
    public static int IndexMinElementArray(int[] a, int start) {

        int indexMinElement = start;
        int minElementArray = a[start];

        if (start == a.length - 1) {
            return indexMinElement;
        }
        if (start < a.length - 1) {
            for (int i = start; i < a.length; ++i) {
                if (minElementArray > a[i]) {
                    minElementArray = a[i];
                    indexMinElement = i;
                }
            }
        }
        return indexMinElement;
    }

    public static int[] selectionSort (int[] a) {

        if (a.length <= 1) {
            return a;
        }

        for (int i = 0; i < a.length; ++i) {

        }

        return a;
    }
}
