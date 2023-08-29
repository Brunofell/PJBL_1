package fila;
public class Fila<T> {
    private int top; // + recente
    private T[] data;
    private int base; // * velho
    private int tamanhoMaximo;
    private int tamanhoAtual;

    public Fila(int size) {
        this.data = (T[]) new Object[size];
        tamanhoMaximo = size;
        base = 0;
        top = -1;
        tamanhoAtual = 0;
    }
    public void add(T value) {
        if (top == tamanhoMaximo - 1) { // verifica se atingiu o limite
            top = -1;
        }
        top++;
        data[top] = value; // incrementa top e adiciona o value no lugar d otop
        tamanhoAtual++; // + 1 tamanho
    }
    public T remove() { // remove seguindo a logica fifo
            T temp = data[base]; // Armazena o elemento da variável temporária na fila na posição base
            base++;                /// incrementa base = avança pro proximo elemento da fila
            if (base == tamanhoMaximo) {
                base = 0;
            } // garantir circular
            tamanhoAtual--; // diminui o tamanho atual
            return temp;// retorna o elemento removido
    }


    public boolean isEmpty() {
        return tamanhoAtual == 0;
    }
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        top = -1;
        base = 0;
    }
    public boolean isFull() {
        return move(top + 1) == base;
    }
    private int move(int position) {
        return position % data.length;
    }
}

