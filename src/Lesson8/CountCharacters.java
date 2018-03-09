package Lesson8;

import java.util.Scanner;

public class CountCharacters {
    public static int quantityLetters(String readLine) {
        int quantityLetters = 0;
        for (int i = 0; i <= readLine.length() - 1; i++) {
            if (Character.isLetter(readLine.charAt(i))) {
                quantityLetters++;
            }
        }
        return quantityLetters;
    }

    public static int quantityDigits(String readLine) {
        int quantityDigits = 0;
        for (int i = 0; i <= readLine.length() - 1; i++) {
            if (Character.isDigit(readLine.charAt(i))) {
                quantityDigits++;
            }
        }
        return quantityDigits;
    }

    public static int quantityWhiteSpace(String readLine) {
        int quantityWhiteSpace = 0;
        for (int i = 0; i <= readLine.length() - 1; i++) {
            if (Character.isWhitespace(readLine.charAt(i))) {
                quantityWhiteSpace++;
            }
        }
        return quantityWhiteSpace;
    }

    public static int quantityOtherSymbols(String readLine) {
        int quantityOtherSymbols = 0;
        for (int i = 0; i <= readLine.length() - 1; i++) {
            if (!Character.isLetterOrDigit(readLine.charAt(i)) && !Character.isWhitespace(readLine.charAt(i))) {
                quantityOtherSymbols++;
            }
        }
        return quantityOtherSymbols;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку для подсчета символов:");
        String readLine = scanner.nextLine();

        System.out.println(readLine);
        System.out.println("Кол-во букв в строке = " + quantityLetters(readLine));
        System.out.println("Кол-во цифр в строке = " + quantityDigits(readLine));
        System.out.println("Кол-во пробелов в строке = " + quantityWhiteSpace(readLine));
        System.out.println("Кол-во остальных символов в строке = " + quantityOtherSymbols(readLine));

    }
}
