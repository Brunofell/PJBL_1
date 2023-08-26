package matriz;
import fila.Fila;

public class Matriz {
    private int coluna;
    private int linha;
    private int matriz[][];
    private static Fila fila = new Fila(100);

    public Matriz(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;


    }

    // estamos montando a matrix e deixando ela com diagonal princiapl feita de 0  e o resto de 1
    public void montaMatriz() {
        matriz = new int[this.coluna][this.linha];
        for (int i = 0; i < this.matriz.length; i++) {
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
    public void mostraMatriz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "  ");
            }
            System.out.println();
        }
    }


    public void floodfill(int posicao_x, int posicao_y) {
        int valorInicial = matriz[posicao_x][posicao_y];
        fila = new Fila(matriz.length * matriz[0].length);
        int move_x[] = {0, 0, 1, -1};
        int move_y[] = {1, -1, 0, 0};
         matriz[posicao_x][posicao_y] = 2; // Mar

        fila.add(posicao_x * matriz[0].length + posicao_y);


        while (!fila.isEmpty()) {
            int coordenadas_atual = (int) fila.remove();
            int linha = coordenadas_atual / matriz[0].length;
            int coluna = coordenadas_atual % matriz[0].length;

            for (int i = 0; i < 4; i++) {
                int avance_x = linha + move_x[i];
                int avance_y = coluna + move_y[i];

                if (avance_x >= 0 && avance_x < matriz.length && avance_y >= 0 && avance_y < matriz[0].length
                        && matriz[avance_x][avance_y] == valorInicial && matriz[avance_x][avance_y] == 1) {
                    matriz[avance_x][avance_y] = 2; // Marcar como visitada
                    fila.add(avance_x * matriz[0].length + avance_y);
                    System.out.println();
                }
            }
            mostraMatriz(matriz);
        }
    }
}
