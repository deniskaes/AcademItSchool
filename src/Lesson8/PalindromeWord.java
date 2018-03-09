package Lesson8;

import java.util.Scanner;

public class PalindromeWord {
    public static boolean isPalindrome(String readLine) {
        if (readLine.length() == 0) {
            return false;
        } else {
            for (int j =0 ,i = 0; i <= (readLine.length() - 1) / 2; ++i) {
                if (Character.toLowerCase(readLine.charAt(i)) != Character.toLowerCase(readLine.charAt(readLine.length() - 1 - i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку для проверки на полиндром:");
        String readLine = scanner.nextLine();

        if (isPalindrome(readLine)) {
            System.out.println("Строка является полиндромом");
        } else {
            System.out.println("Строка не является полиндромом");
        }
    }
}
