package Lesson5;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int readNumber = scanner.nextInt();

        if (readNumber < 2) {
            System.out.println("Не бывает простых чисел меньше " + readNumber);
        } else {
            for (int i = 2; i <= readNumber; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i == j) {
                        System.out.print(i + " ");
                    } else if (i % j == 0) {
                        break;
                    }
                }
            }
        }
    }
}

