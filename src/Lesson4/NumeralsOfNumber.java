package Lesson4;

import java.util.Scanner;

public class NumeralsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число для подсчета:");
        int number = scanner.nextInt();

        int sum = 0;
        int oddSum = 0;
        int maxNumber = 0;

        while (number != 0) {
            int lastNumber = Math.abs(number % 10);
            maxNumber = (maxNumber < lastNumber) ? lastNumber : maxNumber;
            if (lastNumber % 2 == 1) {
                oddSum += lastNumber;
            }
            sum += lastNumber;
            number /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);
        System.out.println("Сумма нечетных цифр числа = " + oddSum);
        System.out.println("Максимльная цифра в числе = " + maxNumber);
    }
}
