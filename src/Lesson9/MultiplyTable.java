package Lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyTable {
    public static int[][] getMultiplyTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < table.length; ++i) {
            for (int k = 0; k < table[i].length; ++k) {
                table[i][k] = (i + 1) * (k + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размерность таблицы:");
        int size = scanner.nextInt();

        for (int[] a : getMultiplyTable(size)) {
            System.out.println(Arrays.toString(a));
        }
    }
}
