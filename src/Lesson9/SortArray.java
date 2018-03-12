package Lesson9;

public class SortArray {
    public static boolean isArrayAscending(int[] array) {
        if (array == null || array.length == 1) {
            return true;
        }
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArrayDescending(int[] array) {
        if (array == null || array.length == 1) {
            return true;
        }
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = {1, 5, 2, 7, 3};

        System.out.println(isArrayAscending(array1));
        System.out.println(isArrayAscending(array2));
        System.out.println(isArrayAscending(array3));
        System.out.println(isArrayDescending(array1));
        System.out.println(isArrayDescending(array2));
        System.out.println(isArrayDescending(array3));
    }
}
