package Lesson8;

import java.util.Scanner;

public class MaxSubString {
    public static int getMaxSubString(String readLine) {
        if (readLine.length() == 0) {
            return 0;
        }
        int maxRepeat = 1;
        int currentRepeat = 1;
        for (int i = 1; i < readLine.length(); ++i) {
            if (Character.toLowerCase(readLine.charAt(i - 1)) != Character.toLowerCase(readLine.charAt(i))) {
                currentRepeat = 1;
            } else {
                currentRepeat++;
                if (maxRepeat < currentRepeat) {
                    maxRepeat = currentRepeat;
                }
            }
        }
        return maxRepeat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку для поиска максимальной подстроки:");
        String readLine = scanner.nextLine();

        System.out.println("Максимальная подстрока = " + getMaxSubString(readLine));

    }
}
