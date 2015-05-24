package app;

import alg.MatrixLoader;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import utils.MatrixGenerator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MatrixLoader loader = new MatrixLoader();

        double[][] matrix = loader.readMatrix();

        RealMatrix realMatrix = MatrixUtils.createRealMatrix(matrix);

        double[][] test = MatrixGenerator.generatePermutationMatrix(5);
        MatrixGenerator.shuffle(test);
    }
}
