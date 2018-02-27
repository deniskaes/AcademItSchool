package Lesson4;

import java.util.Scanner;

public class UsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два операнда и код операции: 1-сложение, 2-вычитание, 3-умножение, 4-деление:");
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        int operation = scanner.nextInt();
        double epsilon = 0.00001;

        switch (operation) {
            case 1:
                System.out.println("Результат операции сложения " + (operand1 + operand2));
                break;
            case 2:
                System.out.println("Результат операции вычитания " + (operand1 - operand2));
                break;
            case 3:
                System.out.println("Результат операции умножения " + (operand1 * operand2));
                break;
            case 4:
                if (Math.abs(operand2) > epsilon) {
                    System.out.println("Результат операции деления " + (operand1 / operand2));
                } else {
                    System.out.println("Деление на 0");
                }
                break;
            default:
                System.out.println("Неизвестная операция.");
        }
    }
}
