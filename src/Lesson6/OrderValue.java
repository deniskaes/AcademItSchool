package Lesson6;

import java.util.Scanner;

public class OrderValue {
    public static double getValue(int firstType, int secondType, double costFistType, double costSecondType) {
        double costBasket = firstType * costFistType + secondType * costSecondType;
        double rate;
        if (costBasket >= 1000 && firstType + secondType >= 10) {
            rate = 0.90;
        } else if (firstType + secondType >= 10 || costBasket >= 1000) {
            rate = 0.95;
        } else {
            rate = 1;
        }
        return costBasket * rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество и цену первого товара:");
        int fistType = scanner.nextInt();
        double costFirstType = scanner.nextDouble();

        System.out.println("Введите количество и цену второго товара:");
        int secondType = scanner.nextInt();
        double costSecondType = scanner.nextDouble();

        System.out.println(getValue(fistType, secondType, costFirstType, costSecondType));
    }
}
