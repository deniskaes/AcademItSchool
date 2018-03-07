package Lesson7;

import java.util.Scanner;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from <= to) {
            this.from = from;
            this.to = to;
        } else {
            this.from = to;
            this.to = from;
        }
    }

    public double getDistance() {
        return to - from;
    }

    public boolean isInside(double number) {
        if (number >= from && number <= to) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи границы интервала:");
        double from = scanner.nextDouble();
        double to = scanner.nextDouble();

        System.out.println("Введи точку для проверки:");
        double number = scanner.nextDouble();

        Range range = new Range(from, to);
        System.out.println("Результат проверки принадлежности = " + range.isInside(number));
    }
}
