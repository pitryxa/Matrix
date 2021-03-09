import matrix.AdditionMatrix;
import matrix.Matrix;
import matrix.RandomMatrix;
import matrix.ScalarMultiplicationMatrix;

public class Main {
    public static void main(String[] args) {
        Matrix aMatrix = new RandomMatrix(3, 4);

        Matrix bMatrix = new RandomMatrix(3, 4, -1, 1);

        Matrix addMatrix = new ScalarMultiplicationMatrix(aMatrix, 0);

        System.out.println(aMatrix);
        System.out.println(bMatrix);
        System.out.println(addMatrix);


    }
}
