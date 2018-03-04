package Lesson6;

import java.util.Scanner;

public class OrderValue {
    public static double calcDiscount(int quantityFirstType, int quantitySecondType, double costFistType, double costSecondType) {
        double costBasket = quantityFirstType * costFistType + quantitySecondType * costSecondType;
        double rate;
        final int STOCK_PRICE = 1000;
        final int STOCK_QUANTITY = 10;
        final double BIG_DISCOUNT = 0.9;
        final double LITTLE_DISCOUNT = 0.95;
        final double NO_DISCOUNT = 1;

        if (costBasket >= STOCK_PRICE && quantityFirstType + quantitySecondType >= STOCK_QUANTITY) {
            rate = BIG_DISCOUNT;
        } else if (quantityFirstType + quantitySecondType >= STOCK_QUANTITY || costBasket >= STOCK_PRICE) {
            rate = LITTLE_DISCOUNT;
        } else {
            rate = NO_DISCOUNT;
        }
        return costBasket * rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество и цену первого товара:");
        int quantityFistType = scanner.nextInt();
        double costFirstType = scanner.nextDouble();

        System.out.println("Введите количество и цену второго товара:");
        int quantitySecondType = scanner.nextInt();
        double costSecondType = scanner.nextDouble();

        System.out.println(calcDiscount(quantityFistType, quantitySecondType, costFirstType, costSecondType));
    }
}
