package Lesson10;

import java.util.Scanner;

public class Power {
    public static double powRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return powRecursion(number, power - 1) * number;
    }

    public static double powNonRecursion(int number, int power) {
        int result = 1;
        while (power > 0) {
            result *= number;
            power--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число:");
        int number = scanner.nextInt();

        System.out.println("Введи степень:");
        int power = scanner.nextInt();

        System.out.println(powRecursion(number, power));
        System.out.println(powNonRecursion(number, power));
    }
}
