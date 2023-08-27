package fila.matriz;
import fila.Fila;
import pilha.Pilha;

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

    public void floodfillFila(int posicao_x, int posicao_y) {
        int[] move_x = new int[]{0, 0, 1, -1};
        int[] move_y = new int[]{1, -1, 0, 0};

        Fila<Integer> fila = new Fila<>(matriz.length * matriz[0].length);

        fila.add(posicao_x * matriz[0].length + posicao_y);
        matriz[posicao_x][posicao_y] = 2;

        while (!fila.isEmpty()) {
            int coordenadas_atual = fila.remove(); // Remova o elemento da fila

            int linha = coordenadas_atual / matriz.length;
            int coluna = coordenadas_atual % matriz[0].length;

            for (int i = 0; i < 4; i++) {
                int avance_x = linha + move_x[i];
                int avance_y = coluna + move_y[i];
                if (avance_x >=0 && avance_x < matriz.length && avance_y >=0 && avance_y < matriz[0].length && matriz[avance_x][avance_y] == 1) {
                    matriz[avance_x][avance_y] = 2;
                    fila.add(avance_x * matriz[0].length + avance_y);
                    mostrarMatriz(matriz);
                    System.out.println();
                }
            }

            // Após preencher uma célula, mostre a matriz atualizada

        }
    }






    public void fillPilha (int linhaInicial, int colunaInicial) {
            int[] direcaoX = {-1, 1, 0, 0};
            int[] direcaoY = {0, 0, -1, 1};

            //Aqui estamos criando uma instância da classe pilha com base nas dimensões da matriz
            Pilha<Integer> pilha = new Pilha<>(matriz.length * matriz[0].length);

            //Aqui estamos transformando a posição bidimensional em um único indíce e adicionando na pilha
            pilha.adicionar(linhaInicial * matriz[0].length + colunaInicial);

            //Definimos como 2 para representar que já foi "pintada"
            matriz[linhaInicial][colunaInicial] = 2;

            
            while (!pilha.estaVazia()) {
                
                //Aqui convertemos o indice em uma posição bi dimensional novamente
                int valorAtual = pilha.remover();
                int l = valorAtual / matriz[0].length;
                int c = valorAtual % matriz[0].length;
                
                //Esse for vai explorar as quatro direções da matriz (Esquerda - Direita - Cima - Baixo)
                for (int i = 0; i < 4; i++) {
                    int linhaVizinha = l + direcaoX[i];
                    int colunaVizinha = c + direcaoY[i];

                    //Nesse if, verificamos se não chegou no limite da matriz. Se não tiver chego e o item da posição atual for = 1, iremos "pintar" ele (marcar como 2). Em seguida, a matriz é mostrada
                    if (linhaVizinha >= 0 && linhaVizinha < matriz.length && colunaVizinha >= 0 && colunaVizinha < matriz[0].length && matriz[linhaVizinha][colunaVizinha] == 1) {
                        matriz[linhaVizinha][colunaVizinha] = 2;
                        pilha.adicionar(linhaVizinha * matriz[0].length + colunaVizinha);
                        mostrarMatriz(matriz);
                        System.out.println();
                    }
                }
            }

        }

}
