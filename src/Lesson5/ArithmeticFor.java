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

        double arithmeticAverage;
        int sum = 0;
        int numberAddendum = secondNumber - firstNumber + 1;

        for (int i = 0; i < numberAddendum; i++) {
            sum += firstNumber + i;
        }

        arithmeticAverage = (double) sum / numberAddendum;
        System.out.printf("Среднее арифметическое с %d до %d равно %.2f", firstNumber, secondNumber, arithmeticAverage);
    }
}
