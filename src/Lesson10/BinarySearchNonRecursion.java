package Lesson10;

public class BinarySearchNonRecursion {
    public static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;
        int numberNotFound = -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (a[middle] == x) {
                return middle;
            } else if (a[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return numberNotFound;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 9;
        System.out.println(binarySearch(a, number));
    }
}
