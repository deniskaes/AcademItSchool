package Lesson3;

import java.util.Scanner;

public class IdentifyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число - положительное");
        }
        if (number % 2 == 0) {
            System.out.println("Число четное");
        }
        if (number % 5 == 0) {
            System.out.println("Кратное 5");
        }
    }
}
