package Lesson7;

import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи границы интервала:");
        double from = scanner.nextDouble();
        double to = scanner.nextDouble();

        System.out.println("Введи точку для проверки:");
        double number = scanner.nextDouble();

        Range range = new Range(from, to);
        System.out.println("Результат проверки принадлежности = " + range.isInside(number));
        System.out.println("Длина интервала = " + range.getDistance());
    }
}
