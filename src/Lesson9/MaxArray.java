package Lesson9;

public class MaxArray {
    public static double getMaxElementArray(double[] a) {
        double maxElementArray = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] > maxElementArray) {
                maxElementArray = a[i];
            }
        }
        return maxElementArray;
    }

    public static void main(String[] args) {
        double[] array = {0.1, 0.02, 2.4, 2.9, 0.4};
        System.out.println("max = " + getMaxElementArray(array));
    }
}
