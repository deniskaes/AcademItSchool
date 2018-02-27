package Lesson4;

public class ArithmeticalAverage {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 21;
        int sum = 0;
        int numberOfOperands = 0;
        int numberOfEven = 0;
        int sumOfEven = 0;

        int i = startNumber;

        while (i <= endNumber) {
            if (i % 2 == 0) {
                sumOfEven += i;
                numberOfEven++;
            }
            sum += i;
            numberOfOperands++;
            i++;
        }
        double arithmeticalAverage = (double) sum / numberOfOperands;
        double arithmeticalAverageEvenNumbers = (double) sumOfEven / numberOfEven;
        System.out.println("Среднее арифметическое = " + arithmeticalAverage);
        System.out.println("Среднее арифметическое четных чисел = " + arithmeticalAverageEvenNumbers);
    }
}
