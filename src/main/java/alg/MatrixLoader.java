package alg;

import utils.MatrixGenerator;

import java.io.*;
import java.util.*;

public class MatrixLoader {

    private final File dataSource;
    private double[][] matrix;

    public MatrixLoader() throws FileNotFoundException {
        dataSource = new File("data.txt");
    }

    public double[][] readMatrix() throws IOException {

        if(matrix == null) {

            Scanner scanner = new Scanner(new BufferedReader(new FileReader(dataSource)));
            int size = scanner.nextInt();

            matrix = new double[size][size];

            System.out.println(size);

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            scanner.close();
        }

        return matrix;
    }
}
