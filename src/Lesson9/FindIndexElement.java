package Lesson9;

import java.util.Scanner;

public class FindIndexElement {
    public static int findIndexElement(int a, int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int indexElement = findIndexElement(4, array);
        if (indexElement == -1) {
            System.out.println("Элемент не найден.");
        } else {
            System.out.println("Индекс " + indexElement);
        }
    }
}
