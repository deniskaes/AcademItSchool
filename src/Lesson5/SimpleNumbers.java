package Lesson5;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int readNumber = scanner.nextInt();

        for (int i = 2; i <= readNumber; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    System.out.println(i);
                }
            }
        }


    }
}
