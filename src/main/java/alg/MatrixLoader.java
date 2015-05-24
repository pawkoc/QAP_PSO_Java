package alg;

import java.io.*;
import java.util.*;

public class MatrixLoader {

    private final File dataSource;
    private double[][] matrix;

    public MatrixLoader() throws FileNotFoundException {
        dataSource = new File("data.txt");
    }

    public double[][] readMatrix() throws IOException {

        Scanner scanner = new Scanner(dataSource);
        int size = scanner.nextInt();
        scanner.nextLine();

        matrix = new double[size][size];

        System.out.println(size);

        for(int i=0; i<size; i++) {
            double[] row = new double[size];
            String[] strings = (String[]) Arrays.asList(scanner.nextLine().split(" ")).toArray();

            for(int j=0; j<size; j++) {
                row[j] = Double.valueOf(strings[j]);
            }

            matrix[i] = row;
        }

        scanner.close();
        return matrix;
    }
}
