package Lesson4;

public class SumWhile {
    public static void main(String[] args) {
        int numberOfOperands = 9;
        int sum = 0;
        int i = 0;

        while (i <= numberOfOperands) {
            sum += i;
            i++;
        }
        System.out.println("Сумма = " + sum);
    }
}
