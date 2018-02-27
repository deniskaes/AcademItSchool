package Lesson3;

import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свой возраст(от 1 до 112):");

        int age = scanner.nextInt();
        int lastTwoSymbolsInAge = age % 100;
        int lastSymbolInAge = lastTwoSymbolsInAge % 10;

        if (age >= 1 && age <= 112) {
            if (lastTwoSymbolsInAge >= 11 && lastTwoSymbolsInAge <= 14) {
                System.out.printf("Вам %d лет", age);
            } else if ( lastSymbolInAge == 1) {
                System.out.printf("Вам %d год", age);
            } else if (lastSymbolInAge >= 2 && lastSymbolInAge <= 4) {
                System.out.printf("Вам %d года", age);
            } else {
                System.out.printf("Вам %d лет", age);
            }
        } else if (age == 0) {
            System.out.println("Слищком молод!");
        } else if (age > 112) {
            System.out.println("Слишком стар!");
        } else {
            System.out.println("Не бывает таких людей!");
        }
    }
}
