package matriz;
import fila.Fila;

public class Matriz {
    private int coluna;
    private int linha;
    private int matriz[][];

    public Matriz(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;
        this.matriz = new int[linha][coluna];

    }

    // estamos montando a matrix e deixando ela com diagonal princiapl feita de 0  e o resto de 1
    public void montaMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 0; // diagonal principal
                } else {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    // mostra a matriz, so isso ela faz
    private static void mostraMatriz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


    //implementa o floodfill aqui

}
