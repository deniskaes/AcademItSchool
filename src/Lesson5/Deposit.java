package Lesson5;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        final int INITIAL_AMOUNT = scanner.nextInt();

        System.out.println("Введите срок вклада в месяцах:");
        final int MONTHS = scanner.nextInt();

        System.out.println("Введите ставку:");
        final double RATE = scanner.nextDouble();

        double partialAmount = INITIAL_AMOUNT;

        for (int i = 1; i <= MONTHS; i++) {
            partialAmount += partialAmount * (1 * RATE / 12 / 100);
        }
        double profit = partialAmount - INITIAL_AMOUNT;
        System.out.println("Прибыль составила" + profit);
    }
}
