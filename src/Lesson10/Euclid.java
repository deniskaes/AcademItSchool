package Lesson10;

import java.util.Scanner;

public class Euclid {
    public static int euclidRecursion(int a, int b) {
        if (b != 0 && a % b == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return euclidRecursion(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи два числа для поиска НОД");
        int number1 = Math.abs(scanner.nextInt());
        int number2 = Math.abs(scanner.nextInt());

        System.out.println("НОД = " + euclidRecursion(number1, number2));
    }
}
