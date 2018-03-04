package Lesson5;

import java.util.Scanner;

public class ArithmeticFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число начала и конца среднего арифметического:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        int numberAddendum = secondNumber - firstNumber + 1;
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }

        double arithmeticAverage = (double) sum / numberAddendum;
        System.out.printf("Среднее арифметическое с %d до %d равно %.2f", firstNumber, secondNumber, arithmeticAverage);
    }
}
