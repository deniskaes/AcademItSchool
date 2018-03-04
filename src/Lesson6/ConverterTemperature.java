package Lesson6;

import java.util.Scanner;

public class ConverterTemperature {
    public static void convertTemp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        double degreesCelsius = scanner.nextDouble();

        final double ABSOLUTE_ZERO = -273.15;

        double degreesKelvin = degreesCelsius - ABSOLUTE_ZERO;

        double degreesFahrenheit = degreesCelsius * 9 / 5 + 32;

        System.out.println("Темперетура в Кельвинах = " + degreesKelvin);
        System.out.println("Температура в Фаренгейтах = " + degreesFahrenheit);
    }

    public static void main(String[] args) {
        convertTemp();
    }

}
