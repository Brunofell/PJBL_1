package fila.matriz;
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

    // método para montar a matriz e deixar ela com diagonal principal feita de 0 e o resto de 1
    public void montarMatriz() {
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

    // método para exibir a matriz no terminal
    private static void mostrarMatriz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


    //implementa o floodfill aqui
    public void floodfill(int posicao_x, int posicao_y) {
        Integer valorInicial = this.matriz[posicao_x][posicao_y];
        Fila<Integer> fila = new Fila<>(this.matriz.length * this.matriz[0].length);
        int[] move_x = new int[]{0, 0, 1, -1};
        int[] move_y = new int[]{1, -1, 0, 0};
        this.matriz[posicao_x][posicao_y] = 2;
        fila.add(posicao_x * this.matriz[0].length + posicao_y);

        while (!fila.isEmpty()) {
            int  coordenadas_atual = fila.remove();

            int linha = coordenadas_atual / this.matriz[0].length;
            int coluna = coordenadas_atual % this.matriz[0].length;

            for (int i = 0; i < 4; ++i) {
                int avance_x = linha + move_x[i];
                int avance_y = coluna + move_y[i];
                if (avance_x >= 0 && avance_x < this.matriz.length && avance_y >= 0 && avance_y < this.matriz[0].length && this.matriz[avance_x][avance_y] ==valorInicial) {
                    this.matriz[avance_x][avance_y] = 2;
                    fila.add(avance_x * this.matriz[0].length + avance_y);
                }
            }
            mostrarMatriz(matriz);
        }
    }


}
