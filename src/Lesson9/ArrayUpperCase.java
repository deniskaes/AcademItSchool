package Lesson9;

import java.util.Arrays;

public class ArrayUpperCase {
    public static String[] toUpperCaseArray(String[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i].toUpperCase();
        }
        return array;
    }

    public static void main(String[] args) {
        String[] names = {"вася", "петя", "рома"};
        System.out.println(Arrays.toString(toUpperCaseArray(names)));

    }
}
