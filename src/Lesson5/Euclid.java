package Lesson5;

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа для нахождения НОД:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int a = Math.abs(firstNumber);
        int b = Math.abs(secondNumber);

        if (a == 0 && b == 0) {
            System.out.printf("НОД(%d,%d) = %s", firstNumber, secondNumber, "Не определен!");
        } else if (b == 0) {
            System.out.printf("НОД(%d,%d) = %d", firstNumber, secondNumber, a);
        } else {
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
            int greatestCommonDivisor = b;
            System.out.printf("НОД(%d,%d) = %d", firstNumber, secondNumber, greatestCommonDivisor);
        }
    }
}
