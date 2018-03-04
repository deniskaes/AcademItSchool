package Lesson5;

public class PrinterIf {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
