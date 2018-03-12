package Lesson9;

import java.util.Arrays;

public class InvertArray {
    public static int[] getInvertArray(int[] array) {
        if (array == null || array.length == 1) {
            return array;
        }
        for (int i = 0; i < array.length / 2; ++i) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Первоначальный массив" + Arrays.toString(array));
        System.out.println("Перевернутый массив" + Arrays.toString(getInvertArray(array)));
    }
}
