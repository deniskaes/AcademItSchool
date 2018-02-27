package Lesson5;

import java.util.Scanner;

public class TaskWithBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fixedWord = "stop";

        while (true) {
            System.out.println("Введи стоп-слово:");
            String readWord = scanner.nextLine();

            if (readWord.equals(fixedWord)) {
                System.out.println("В точку.");
                break;
            } else {
                System.out.println("Мимо=)");
            }
        }
    }
}
