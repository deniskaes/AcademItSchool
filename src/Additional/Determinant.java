package Additional;

import java.util.Arrays;

public class Determinant {

    private static double determinant(double[][] matrix) {
        if (matrix.length == 1 ) {
            return matrix[0][0];
        }
        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }

        double determinant = 0;
        int decayLine = 0;

        for (int i = 0; i < matrix.length; ++i) {
            double[][] minorMatrix = new double[matrix.length - 1][matrix.length - 1];

            for (int k = 0; k < matrix.length - 1; ++k) {

                for (int m = 0; m < matrix.length - 1; ++m) {
                    if (m >= i) {
                        minorMatrix[k][m] = matrix[k + 1][m + 1];
                    } else {
                        minorMatrix[k][m] = matrix[k + 1][m];
                    }
                }
            }

            determinant += matrix[decayLine][i] * Math.pow(-1, i + decayLine) * determinant(minorMatrix);
        }

        return determinant;
    }

    public static void main(String[] args) {

        double matrix[][] = {{-7, 8, 9, 5}, {4, 0, 6, 3}, {1, -2, 3, 6}, {4, 7, 1, 2}};

        System.out.println("Матрица:");
        for (double[] e : matrix) {
            System.out.println(Arrays.toString(e));
        }
        System.out.println("размерность = " + matrix.length);
        System.out.println("Определитель матрицы = " + determinant(matrix));
    }
}
