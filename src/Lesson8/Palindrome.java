package Lesson8;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String readLine) {
        if (readLine.length() == 0) {
            return false;
        }
        for (int i = 0; i < readLine.length(); i++) {
            if (Character.isLetterOrDigit(readLine.charAt(i))) {
                break;
            }
            if (i == readLine.length() - 1) {
                return false;
            }
        }
        for (int m = readLine.length() - 1, i = 0; i < m; i++, m--) {
            while (!Character.isLetterOrDigit(readLine.charAt(i)) || !Character.isLetterOrDigit(readLine.charAt(m))) {
                if (!Character.isLetterOrDigit(readLine.charAt(i))) {
                    i++;
                }
                if (!Character.isLetterOrDigit(readLine.charAt(m))) {
                    m--;
                }
            }
            if (Character.toLowerCase(readLine.charAt(i)) != Character.toLowerCase(readLine.charAt(m))) {
                return false;
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


