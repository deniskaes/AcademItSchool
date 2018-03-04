package Lesson5;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада:");
        int initialAmount = scanner.nextInt();

        System.out.println("Введите срок вклада в месяцах:");
        int months = scanner.nextInt();

        System.out.println("Введите ставку:");
        double rate = scanner.nextDouble();
        final int MONTHS_IN_YEAR = 12;
        final int PCT = 100;

        double partialAmount = initialAmount;

        for (int i = 1; i <= months; i++) {
            partialAmount += partialAmount * (rate / MONTHS_IN_YEAR / PCT);
        }
        double profit = partialAmount - initialAmount;
        System.out.println("Прибыль составила: " + profit);
        System.out.println("Сумма выплаты в конце срока вкоада: " + partialAmount);
    }
}
