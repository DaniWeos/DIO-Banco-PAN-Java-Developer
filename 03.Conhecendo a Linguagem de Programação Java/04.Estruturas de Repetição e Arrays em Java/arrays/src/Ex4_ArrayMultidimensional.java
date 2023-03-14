import java.util.Random;

public class Ex4_ArrayMultidimensional {

    /*
     * Gerar uma matriz 4x4 com numeros aleatorios.
     */
    public static void main(String[] args) throws Exception {

    Random random = new Random();

    int[][] M = new int [4][4];
    
    for (int i = 0; i < M.length; i++) {
        for (int j = 0; j < M[i].length; j++) {
            M[i][j] = random.nextInt(9);
        }
    }

    System.out.println("Matriz: ");
    for (int[] linha : M) {
        for (int coluna : linha) {
            System.out.print(coluna + " ");
        }
        System.out.println();
    }
    }
}
