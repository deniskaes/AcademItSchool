package Lesson9;

public class AverageArithmeticArray {
    public static double getAverageArithmeticEven(int[] array) {
        int countAddendum = 0;
        int sum = 0;
        for (int elementArray : array) {
            if (elementArray % 2 == 0) {
                sum += elementArray;
                countAddendum++;
            }
        }
        if (countAddendum != 0) {
            return (double) sum / countAddendum;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 3, 5, 7, 9};
        System.out.println("Среднее арифметическое четных в масиве1 =" + getAverageArithmeticEven(array));
        System.out.println("Среднее арифметическое четных в масиве2 =" + getAverageArithmeticEven(array2));
    }
}
