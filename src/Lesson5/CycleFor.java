package Lesson5;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 7; i <= 121; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i >= 30; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
