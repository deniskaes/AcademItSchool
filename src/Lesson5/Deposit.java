package Lesson5;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capitalizationPeriod = 1;

        System.out.println("Введите сумму денежных средств:");
        int initialAmount = scanner.nextInt();

        System.out.println("Ввдедите срок депозита в месяцах:");
        int month = scanner.nextInt();

        System.out.println("Введи ставку:");
        double rate = scanner.nextDouble();

        double profit = initialAmount * rate * month / 12 / 100;
        double payout = profit + initialAmount;

        System.out.println("Выплата в конце срока =" + payout);
        System.out.println("Прибыль = " + profit);

        int profitPeriods = month / capitalizationPeriod;

        double payoutWithCapitalization = initialAmount * (Math.pow((1 + rate * capitalizationPeriod / 12 / 100), profitPeriods));
        double profitWithCapitalization = payoutWithCapitalization - initialAmount;

        System.out.println("Выплата с капитализацией в конце срока =" + payoutWithCapitalization);
        System.out.println("Прибыль с капитализацией= " + profitWithCapitalization);
    }
}
