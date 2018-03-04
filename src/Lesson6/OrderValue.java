package Lesson6;

import java.util.Scanner;

public class OrderValue {
    public static double getValue(int quantityFirstType, int quantitySecondType, double costFistType, double costSecondType) {
        double costBasket = quantityFirstType * costFistType + quantitySecondType * costSecondType;
        double rate;
        if (costBasket >= 1000 && quantityFirstType + quantitySecondType >= 10) {
            rate = 0.90;
        } else if (quantityFirstType + quantitySecondType >= 10 || costBasket >= 1000) {
            rate = 0.95;
        } else {
            rate = 1;
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

        System.out.println(getValue(quantityFistType, quantitySecondType, costFirstType, costSecondType));
    }
}
