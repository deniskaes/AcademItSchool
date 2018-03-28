package Additional;

import java.util.Arrays;

public class Determinant {

    public static double determinant(double[][] matrix) {
        int size = matrix.length;
        double epsilon = 0.00001;

        for (int i = 0; i < size; ++i) {

            if (Math.abs(matrix[i][i]) <= epsilon) {
                boolean isDeterminantZero;
                isDeterminantZero = true;

                for (int j = i + 1; j < size; ++j) {

                    if (Math.abs(matrix[j][i]) > epsilon) {
                        isDeterminantZero = false;
                        double[] temp = new double[size];

                        for (int m = 0; m < size; ++m) {
                            temp[m] = matrix[i][m];
                            matrix[i][m] = matrix[j][m];
                            matrix[j][m] = temp[m];
                        }

                        break;
                    }
                }
                if (isDeterminantZero) {
                    return 0;
                }
            }

            for (int k = i + 1; k < size; ++k) {

                double coefficient = matrix[k][i] / matrix[i][i];

                if (Math.abs(coefficient) <= epsilon) {
                    continue;
                }

                for (int j = 0; j < size; ++j) {
                    matrix[k][j] = matrix[k][j] - matrix[i][j] * coefficient;
                }
            }
        }

        double determinant = 1;

        for (int i = 0; i < size; ++i) {
            determinant *= matrix[i][i];
        }
        return determinant;
    }

    public static void main(String[] args) {

        double[][] matrix = {{-7, 8, 9}, {4, 0, 6}, {1, -2, 3}};
        double[][] matrixToTriangle = Arrays.copyOf(matrix, matrix.length);

        System.out.println("Размерность = " + matrix.length);
        for (double[] e : matrix) {
            System.out.println(Arrays.toString(e));
        }
        System.out.println("Определитель матрицы = " + determinant(matrixToTriangle));
    }
}
