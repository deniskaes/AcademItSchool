package Lesson4;

public class SumFrom3To21 {
    public static void main(String[] args) {
        int startNumber = 3;
        int endNumber = 5;
        int sumOfEven = 0;
        int evenNumbers = 0;
        int i = startNumber;

        while (i <= endNumber) {
            if (i % 2 == 0) {
                evenNumbers++;
                sumOfEven += i;
            }
            i++;
        }
        System.out.println("Сумма = " + sumOfEven + " количество четных чисел = " + evenNumbers);
    }
}
