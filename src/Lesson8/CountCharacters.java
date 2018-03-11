package Lesson8;

import java.util.Scanner;

public class CountCharacters {
    public static int getQuantityLetters(String readLine) {
        int quantityLetters = 0;
        for (int i = 0; i < readLine.length(); i++) {
            if (Character.isLetter(readLine.charAt(i))) {
                quantityLetters++;
            }
        }
        return quantityLetters;
    }

    public static int getQuantityDigits(String readLine) {
        int quantityDigits = 0;
        for (int i = 0; i < readLine.length(); i++) {
            if (Character.isDigit(readLine.charAt(i))) {
                quantityDigits++;
            }
        }
        return quantityDigits;
    }

    public static int getQuantityWhiteSpace(String readLine) {
        int quantityWhiteSpace = 0;
        for (int i = 0; i < readLine.length(); i++) {
            if (Character.isWhitespace(readLine.charAt(i))) {
                quantityWhiteSpace++;
            }
        }
        return quantityWhiteSpace;
    }

    public static int getQuantityOtherSymbols(String readLine) {
        int quantityOtherSymbols = 0;
        for (int i = 0; i < readLine.length(); i++) {
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
        System.out.println("Кол-во букв в строке = " + getQuantityLetters(readLine));
        System.out.println("Кол-во цифр в строке = " + getQuantityDigits(readLine));
        System.out.println("Кол-во пробелов в строке = " + getQuantityWhiteSpace(readLine));
        System.out.println("Кол-во остальных символов в строке = " + getQuantityOtherSymbols(readLine));

    }
}
