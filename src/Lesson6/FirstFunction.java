package Lesson6;

public class FirstFunction {
    public static double getSum(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage(int firstNumber, int secondNumber) {
        int sum = 0;
        int count = 0;
        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    public static double getMax(double number1, double number2) {
        if (number1 >= number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static double getMin(double number1, double number2) {
        if (number1 <= number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        double result = getSum(1.1, 5.5);
        System.out.println("Результат функции сложения = " + result);
        System.out.println("Результат функции сложения = " + getSum(5.5, 1.1));

        double testAverage = getAverage(1, 10);
        System.out.println("Среднее арифметическое = " + testAverage);
        System.out.println("Среднее арифметическое = " + getAverage(10, 1));

        System.out.println("Это функция максимума" + getMax(12, 21));
        System.out.println("Это функция максимума" + getMax(-12, -21));

        System.out.println("Это функция минимума" + getMin(12, 21));
        System.out.println("Это функция минимума" + getMin(-12, -21));
    }
}
