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
            this.to = to;
            this.from = from;
        }
    }


    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getDistance() {
        return getTo() - getFrom() + 1;
    }

    public boolean isInside(double number) {
        return (number >= getFrom() && number <= getTo());

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
        System.out.println("Длина интервала = " + range.getDistance());
    }
}
