package Lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String correctPass = "VeryHardPassword";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи пароль:");
        String userPass = scanner.nextLine();

        if (userPass.equals(correctPass)) {
            System.out.println("Пароль верный. Добропожаловать!");
        } else if (userPass.length() > correctPass.length()) {
            System.out.println("Пароль слишком длинный.");
        } else if (userPass.length() < correctPass.length()) {
            System.out.println("Пароль слишком короткий.");
        } else {
            System.out.println("Пароль неверный.");
        }
    }
}
