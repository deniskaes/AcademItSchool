package Lesson3;

import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи два числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.printf("Максилальное число %d минимальное число %d", number1, number2);
        } else {
            System.out.printf("Максилальное чмсло %d минимальное число %d%n", number2, number1);
        }

        int max = (number1 > number2) ? number1 : number2;
        int min = (number2 > number1) ? number1 : number2;

        System.out.printf("Максилальное число %d минимальное число %d", max, min);
    }
}
