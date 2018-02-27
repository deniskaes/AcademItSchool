package Lesson4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер числа Фибоначи :");
        int ordinalNumberFibonacci = scanner.nextInt();
        int fistNumberFibonacci = 0;
        int secondNumberFibonacci = 1;
        int newNumberFibonacci = 0;
        int i = 1;

        if (ordinalNumberFibonacci == 0) {
            System.out.println("Число фибоначи с номером " + ordinalNumberFibonacci + " = " + fistNumberFibonacci);
        } else if (ordinalNumberFibonacci == 1) {
            System.out.println("Число фибоначи с номером " + ordinalNumberFibonacci + " = " + secondNumberFibonacci);
        } else {
            while (i < ordinalNumberFibonacci) {
                newNumberFibonacci = fistNumberFibonacci + secondNumberFibonacci;
                fistNumberFibonacci = secondNumberFibonacci;
                secondNumberFibonacci = newNumberFibonacci;
                i++;
            }
            System.out.println("Число фибоначи с номером " + ordinalNumberFibonacci + " = " + newNumberFibonacci);
        }
    }
}
