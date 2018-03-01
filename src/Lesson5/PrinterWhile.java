package Lesson5;

public class PrinterWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i != 5 && i % 3 != 0 && (i <= 60 || i >= 80)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
