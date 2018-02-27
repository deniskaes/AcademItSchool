package Lesson4;

public class PrinterInLine {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 11;
        int numberPerLine = 10;

        int j = startNumber;

        while (j <= endNumber) {
            int i = 0;
            while (i < numberPerLine) {
                System.out.printf("%2d ", j);
                j++;
                i++;
                if (j > endNumber) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
