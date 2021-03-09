import matrix.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Matrix aMatrix = new RandomMatrix(2, 3, rnd -> rnd.nextInt(4));

        Matrix bMatrix = new RandomMatrix(3, 2, rnd -> rnd.nextInt(4));

        Matrix multMatrix = new MultiplicationMatrix(aMatrix, bMatrix);

        System.out.println(aMatrix);
        System.out.println(bMatrix);
        System.out.println(multMatrix);


    }
}
