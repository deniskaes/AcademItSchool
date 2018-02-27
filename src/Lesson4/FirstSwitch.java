package Lesson4;

import java.util.Scanner;

public class FirstSwitch {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду:");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введи строку");
                String readLine = scanner.nextLine();
                System.out.println(readLine);
                break;
            case "sum":
                System.out.println("Введи два вещественных слогаемых");
                double number1 = scanner.nextDouble();
                double number2 = scanner.nextDouble();
                System.out.println("Сумма чисел = " + (number1 + number2));
                break;
            default:
                System.out.println("Такая команда мне неизвестна.");
        }
    }
}
