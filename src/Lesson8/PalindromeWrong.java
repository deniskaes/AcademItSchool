package Lesson8;

import java.util.Scanner;

public class PalindromeWrong {
    public static boolean isPalindrome(String readLine) {
        if (readLine.length() == 0) {
            return false;
        }
        int whiteSpaceLobbyPart = 0;
        int whiteSpaceRearPart = 0;
        for (int m = readLine.length() - 1, i = 0; i < m; i++, m--) {
            if (Character.toLowerCase(readLine.charAt(i - whiteSpaceRearPart)) != Character.toLowerCase(readLine.charAt(m + whiteSpaceLobbyPart))) {
                if (Character.isWhitespace(readLine.charAt(i - whiteSpaceRearPart))) {
                    whiteSpaceLobbyPart++;
                } else if (Character.isWhitespace(readLine.charAt(m + whiteSpaceLobbyPart))) {
                    whiteSpaceRearPart++;
                } else {
                    return false;
                }
            }
        }
        return true;
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
//Арген тина, манит негра