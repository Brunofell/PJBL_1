package fila;
public class Fila<T> {

    private int top;
    private T[] data;
    private int base;
    private int tamanhoMaximo;

    public Fila(int size) {
        this.data = (T[]) new Object[size];
        tamanhoMaximo = size;
        base = 0;
        top = -1;
    }

    public void add(T value) {
        if (top == tamanhoMaximo - 1) {
            top = -1;
        }
        data[++top] = value;
    }

    public T remove() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível remover.");
            return null;
        }

        T temp = data[base++];
        if (base == tamanhoMaximo) {
            base = 0;
        }
        return temp;
    }

    public boolean isEmpty() {
        return (top == -1);
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

