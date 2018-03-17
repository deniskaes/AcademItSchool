package Lesson10;

public class BinarySearchRecursion {
    public static int binarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (a[middle] == x) {
            return middle;
        } else if (a[middle] < x) {
            return binarySearch(a, middle + 1, right, x);
        } else {
            return binarySearch(a, left, middle - 1, x);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = a.length - 1;
        int number = 10;
        System.out.println(binarySearch(a,left,right,number));
    }
}
