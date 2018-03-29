package Additional;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        double matrix[][] = {{-7,8,9,5},{4,0,6,3},{1,-2,3,6},{4,7,1,2}};

        int j = 0;
        for (int i = 0; i < matrix.length; ++i) {
            double[][] minorMatrix = new double[matrix.length - 1][matrix.length - 1];

            for (int k = 0; k<matrix.length - 1; ++k) {
                for (int m = 0; m<matrix.length - 1;++m){
                    if(m >= i){
                        minorMatrix[k][m] = matrix[k+1][m+1];
                    } else {
                        minorMatrix[k][m] = matrix[k + 1][m];
                    }
                }
            }

        }
    }
}
