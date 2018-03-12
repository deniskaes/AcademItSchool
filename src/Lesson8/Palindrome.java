package Lesson8;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String readLine) {
        if (readLine.length() == 0) {
            return false;
        }
        int i = 0;
        int m = readLine.length() - 1;

        while (i < m) {
            if (Character.toLowerCase(readLine.charAt(i)) == Character.toLowerCase(readLine.charAt(m))) {
                i++;
                m--;
            } else {
                if (!Character.isLetter(readLine.charAt(i)) && Character.isLetter(readLine.charAt(m))) {
                    i++;
                } else if (!Character.isLetter(readLine.charAt(m)) && Character.isLetter(readLine.charAt(i))) {
                    m--;
                } else if (!Character.isLetter(readLine.charAt(m)) && !Character.isLetter(readLine.charAt(i))){
                    i++;
                    m--;
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


