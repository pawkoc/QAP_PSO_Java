package utils;

import java.util.Random;

public class MatrixGenerator {

    public static double[][] generatePermutationMatrix(int size) {
        double[][] result = new double[size][size];

        for(int i=0; i<size; i++) {
            double[] vector = new double[size];
            vector[i] = 1.0;
            result[i] = vector;
        }

        return result;
    }

    public static double[][] shuffle(double[][] matrix, int trials) {
        Random rand = new Random();

        for(int i=0; i<trials; i++) {
            int r1 = rand.nextInt(matrix.length);
            int r2 = rand.nextInt(matrix.length);

            double[] tmp = matrix[r1];
            matrix[r1] = matrix[r2];
            matrix[r2] = tmp;
        }

        printMatrix(matrix);

        return matrix;
    }

    public static double[][] shuffle(double[][] matrix) {
        return shuffle(matrix, 2*matrix.length);
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
    }
}
