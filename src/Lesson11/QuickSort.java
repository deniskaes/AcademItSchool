package Lesson11;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] a, int left, int right) {
        int bearingElement = (a[right] + a[left]) / 2;
        int i = left;
        int j = right;

        if (right - left == 1 && a[right] < a[left]) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            return;
        }

        if (right - left <= 1) {
            return;
        }

        while (i <= j) {
            if (a[i] < bearingElement) {
                i++;
            } else if (a[j] > bearingElement) {
                j--;
            } else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (i < right) {
            quickSort(a, i, right);
        }

        if (j > left) {
            quickSort(a, left, j);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, -4, 5, -4, 2, 7, -6, 3, -7, -2, 10, 11, 6, 8};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
