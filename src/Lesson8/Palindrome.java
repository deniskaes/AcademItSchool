package Lesson8;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String readLine) {
        if (readLine.length() == 0) {
            return false;
        } else {
            for (int k = 0, j = 0, i = 0; i <= readLine.length() / 2 + k + j; i++) {
                if (Character.toLowerCase(readLine.charAt(i - k)) != Character.toLowerCase(readLine.charAt(readLine.length() - 1 - i + j))) {
                    if (Character.isWhitespace(readLine.charAt(i - k))) {
                        j++;
                    } else if (Character.isWhitespace(readLine.charAt(readLine.length() - 1 - i + j))) {
                        k++;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки на полиндром:");
        String readLine = scanner.nextLine();

        if (isPalindrome(readLine)) {
            System.out.println("Строка является полиндромом");
        } else {
            System.out.println("Строка не является полиндромом");
        }
    }
}
