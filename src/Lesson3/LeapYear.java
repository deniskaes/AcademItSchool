package Lesson3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи год для проверки:");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("Год %d - высокосный.", year);
        } else {
            System.out.printf("Год %d - не высокосный.", year);
        }
        //год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400
    }
}
