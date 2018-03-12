package Lesson9;

public class MaxArray {
    public static double getMaxArray(double[] a) {
        double epsilon = 0.0001;
        double maxArray = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] - maxArray > epsilon) {
                maxArray = a[i];
            }
        }
        return maxArray;
    }

    public static void main(String[] args) {
        double[] array = {0.1, 0.02, 2.4, 2.9, 0.4};
        System.out.println("max = " + getMaxArray(array));
    }
}
