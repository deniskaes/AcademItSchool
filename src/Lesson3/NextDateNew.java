package Lesson3;

import java.util.Scanner;

public class NextDateNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        boolean dateIsTrue = true;
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (month > 0 && month < 13 && year > 1582) {
            int lastDayInMonth;
            if (month == 2) {
                lastDayInMonth = (leapYear) ? 29 : 28;
            } else {
                lastDayInMonth = (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
            }
            if (day <= lastDayInMonth && day > 0) {
                if (day == lastDayInMonth && month == 12) {
                    day = 1;
                    month = 1;
                    year += 1;
                } else if (day == lastDayInMonth) {
                    day = 1;
                    month += 1;
                } else {
                    day += 1;
                }
            } else {
                dateIsTrue = false;
            }
        } else {
            dateIsTrue = false;
        }
        if (dateIsTrue) {
            System.out.printf("Следующая дата %02d %02d %04d%n", day, month, year);
        } else {
            System.out.println("Введена некорректная дата!");
        }
    }
}
