package Lesson4;

public class ArithmeticalAverageDoWhile {
    public static void main(String[] args) {
        int startNumber = 0;
        int endNumber = 1;
        int sum = 0;
        int i = startNumber;

        do {
            sum += i;
            i++;
        } while (i <= endNumber);
        double arithmeticalAverage = (double) sum / (endNumber - startNumber + 1);
        System.out.println(arithmeticalAverage);
    }
}
