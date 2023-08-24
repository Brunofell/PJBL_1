package fila;

public class Fila <T>{

    private int top = -1;
    private T[] data;
    private int base = 0;

    public Fila(int size) {
        this.data = (T[]) new Object[size];
    }
    public void add(T item) {
        if (!isFull()) {
            top = move(top + 1);
            data[top] = item;
        }
    }

    public T remove() {
        if (!isEmpty()) {
            T item = data[base];
            data[base] = null;
            base = move(base + 1);
            return item;
        } else {
            return null;
        }
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
    public boolean isEmpty() {
        return top == -1;
    }
    private int move(int position) {
        return position % data.length;
    }


}

