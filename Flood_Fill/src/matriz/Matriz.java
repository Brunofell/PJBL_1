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


    // estamos montando a matrix e deixando ela com diagonal princiapl feita de 0
    public void montarMatriz() {
        for (int i = 0; i < linha; i++) {
            matriz[i][i] = 0;
            for (int j = 0; j < coluna; j++) {
                if (i != j) {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    // mostra a matriz
    public void mostraMatriz() {
       for (int[] linha : matriz) {
         for (int cell : linha) {
              System.out.print(cell + " ");
          }
          System.out.println();
       }
    }


    public boolean isSidePainted() {
        for (int i = 0; i < linha; i++) {
            if (matriz[i][i] != 2) {
                return false;
            }
        }
        return true;
    }

    public void floodFill (int x, int y, int alvo, int substituto){
        int[] direcaox = {-1, 1, 0, 0}; // tem as direções para mover para baixo e para cima
        int[] direcaoy = {0, 0, -1, 1}; // direção para mover para a direita para esquerda


        //Aqui to criando duas instâncias da classe que contém a fila, assim da pra usar os metodos que a
        // gente quer e também pra armazenar as coordenadas lá
        Fila<Integer> filax = new Fila<>(linha * coluna);
        Fila<Integer> filay = new Fila<>(linha * coluna);


        // Aqui eu to marcando o ponto inicial do flood fill
        filax.add(x);
        filay.add(y);
        matriz[x][y] = substituto; // Aqui eu to marcando o ponto inicial como ponto visitado.


        // esse loop While vai rodar enquanto ate a filax estiver vazia
        // tipo ate tudo tiver pintado.

        while(!filax.isEmpty()) {
            // aqui to removendo o ponto atual pra explorar outros
            int x_anteior = filax.remove();
            int y_anterior = filay.remove();

            // esse for aqui ele percorre os array que vai pra baixo e pra cima pra ver se
            // pra ver os 4 vizinhos do alvo atual que ele ta
            // dai ele guarda novos valores a cada vizinho somando x com o dx e dy com o y
            // DAI SE AS COORDENADAS ESTIVEREM DENTRO DA MATRIZ E P ALVO DENTRO DO ALVO, QUER DIZER
            // QUE ainda não foi pintado dai vai ser adicionado na filax e y, e atualiza o valor.
            for (int i = 0; i < 4; i++) {
                int x_atual = x + direcaox[i];
                int y_atual = y + direcaoy[i];


                if (x_atual >= 0 && x_atual < linha && y - x_atual >= 0 && y_atual < coluna && matriz[x_atual][y_atual] == alvo) {
                    filax.add(x_atual);
                    filay.add(y_atual);
                    matriz[x_atual][y_atual] = substituto; // aqui ele vai marcar como ja pintado
                }
            }
        }


    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha(){
        return linha;
    }
    public int getValue(int x, int y) {
        return matriz[x][y];
    }

}
