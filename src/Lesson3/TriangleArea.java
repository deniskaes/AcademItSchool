package Lesson3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты вершин треугольника(можно в строку через пробел или через enter):");

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double epsilon = 0.0001;

        if (Math.abs((x2 - x1) * (y3 - y2) - (x3 - x2) * (y2 - y1)) < epsilon) {
            System.out.println("Точки лежат на одной прямой!");
        } else {
            double sideA = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double sideB = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
            double sideC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

            double semiPerimeter = (sideA + sideB + sideC) / 2;
            double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

            System.out.printf("Площадь треугольника = %.5f", triangleArea);

        }
    }
}
