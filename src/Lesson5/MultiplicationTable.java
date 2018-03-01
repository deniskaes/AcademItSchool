package Lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность таблицы:");
        int sizeTable = scanner.nextInt();

        if (sizeTable < 1) {
            System.out.println("Не верная размерность!");
        } else {
            System.out.print("    ");
            for (int i = 1; i <= sizeTable; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println();

            for (int i = 1; i <= (sizeTable + 1) * 4; i++)
                System.out.print("-");
            System.out.println();

            for (int i = 1; i <= sizeTable; i++) {
                System.out.printf("%3d|", i);
                for (int j = 1; j <= sizeTable; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
    }
}