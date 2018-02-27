package Lesson3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввелите коэфиценты уравнения(a b c):");

        double epsilon = 0.0000001;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        if (Math.abs(a) > epsilon) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant > epsilon) {
                double rootNumber1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double rootNumber2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Уравнение имеет два корня х1 = " + rootNumber1 + " x2 = " + rootNumber2);
                System.out.println(discriminant);
            } else if (Math.abs(discriminant) <= epsilon) {
                double rootSingle = -b / (2 * a);
                System.out.println("Уравнение имеет один корень" + rootSingle);
                System.out.println(discriminant);
            } else {
                System.out.println("Корней НЕТ!");
                System.out.println(discriminant);
            }
        } else if (Math.abs(b) > epsilon) {
            double rootSingle = -c / b;
            System.out.println("Уравнение имеет один корень" + rootSingle);
        } else if (Math.abs(c) <= epsilon) {
            System.out.println("Решений бесконечное множетво");
        } else {
            System.out.println("Корней НЕТ!");
        }
    }
}
