package Lesson11;

public class MinElementArray {

    public static int minElementArray(int[] a, int start) {

        int minElementIndex = start;
        int minElement = a[start];

        for (int i = start + 1; i < a.length; ++i) {
            if (minElement > a[i]) {
                minElement = a[i];
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 5, 2, 9, 1, 4};
        System.out.println(minElementArray(array, 0));
    }
}