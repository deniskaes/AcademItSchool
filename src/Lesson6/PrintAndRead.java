package Lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String s){
        Scanner scanner = new Scanner(System.in);

        System.out.println(s);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int numberA = printAndRead("Первое число:");
        int numberB = printAndRead("Второе число:");
    }
}
