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

        int capitalizationPeriod = 1;

        int quantityCapitalizationPeriod = months / capitalizationPeriod;

        double partialAmount = initialAmount;

        for (int i = 1; i <= quantityCapitalizationPeriod; i++) {
            partialAmount += partialAmount * (capitalizationPeriod * rate / 12 / 100);
        }
        double profit = partialAmount - initialAmount;
        System.out.println("Прибыль составила" + profit);
    }
}
