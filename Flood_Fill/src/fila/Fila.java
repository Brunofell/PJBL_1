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
        if (top == tamanhoMaximo - 1) {
            top = -1;
        }
        data[++top] = value;
        tamanhoAtual++;
    }
    public T remove() {
            T temp = data[base++];
            if (base == tamanhoMaximo) {
                base = 0;
            }
            tamanhoAtual--;
            return temp;
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

