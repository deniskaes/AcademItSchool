package Lesson6;

import java.util.Scanner;

public class ConverterTemperature {
    public static double convertCelsiusToKelvin(double degreesCelsius) {
        final double ABSOLUTE_ZERO = -273.15;
        return degreesCelsius - ABSOLUTE_ZERO;
    }

    public static double convertCelsiusToFahrenheit(double degreesCelsius) {
        return degreesCelsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        double degreesCelsius = scanner.nextDouble();

        System.out.println("Температура в Кельвинах " + convertCelsiusToKelvin(degreesCelsius));
        System.out.println("Температура в Фаренгейтах " + convertCelsiusToFahrenheit(degreesCelsius));
    }

}
