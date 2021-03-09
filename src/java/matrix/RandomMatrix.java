package matrix;

import java.util.Random;

public class RandomMatrix extends Matrix {

    public RandomMatrix(int rows, int cols) {
        super(rows, cols);
        this.matrix = random();
    }

    protected Double[][] random() {
        Random rnd = new Random();
        Double[][] data = new Double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = rnd.nextDouble();
            }
        }
        return data;
    }
}
