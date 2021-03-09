package matrix;

public class AdditionMatrix extends Matrix {

    public AdditionMatrix(Matrix aMatrix, Matrix bMatrix) {
        super(aMatrix.rows, aMatrix.cols);
        if (!validate(aMatrix, bMatrix)) {
            throw new IllegalArgumentException("Both matrices must have the same number of rows and columns.");
        }
        this.matrix = addition(aMatrix, bMatrix);
    }

    protected Double[][] addition(Matrix aMatrix, Matrix bMatrix) {
        Double[][] data = new Double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = aMatrix.matrix[i][j] + bMatrix.matrix[i][j];
            }
        }
        return data;
    }

    protected boolean validate(Matrix aMatrix, Matrix bMatrix) {
        return aMatrix.rows == bMatrix.rows && aMatrix.cols == bMatrix.cols;
    }
}
