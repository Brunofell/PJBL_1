package matriz;

public class Matrix {
    private int coluna;
    private int linha;
    private int matriz[][];

    void matriz(int coluna, int linha) {
        setColuna(coluna);
        setLinha(linha);
        montarMatriz();
    }

    private void setColuna(int x) {
        coluna = 10;
    }

    private void setLinha(int x) {
        linha = 10;
    }

    private int getColuna(){
        return coluna;
    };
    private int getLinha(){
        return linha;
    };

    public void montarMatriz() {
        matriz = new int [coluna][linha];
        for (int i=0; i<matriz[i].length - 1;i++) {
            for(int y=0; y<matriz[y].length - 1;y++) {
                matriz[i][y] = 0;
            }

        }
    }
}
