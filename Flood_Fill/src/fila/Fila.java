package fila;
public class Fila<T> {
    private T queue[];
    private int size;
    private int top;
    private int base;
    private boolean isFull;
    private boolean isEmpty;

    public Fila(int size) {
        this.queue = (T[]) new Object[size];
        this.size = size;
        this.top = -1;
        this.base = 0;
        this.isFull = false;
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return top == -1 && base == 0;
    }

    public boolean isFull() {
        return (top + 1) % size == base && !isEmpty();
    }

    public void add(T value) {
        if (!isFull()) {
            top = move(top);
            queue[top] = value;
            isEmpty = false;
        } else {
            System.out.println("A fila está cheia. Não é possível adicionar.");
            isFull = true;
        }
    }

    public T remove() {
        if (!isEmpty()) {
            T removedValue = queue[base];
            System.out.println("Elemento removido: " + removedValue);
            queue[base] = null;
            base = move(base);
            isFull = false;
            return removedValue;
        } else {
            System.out.println("A fila está vazia. Não é possível remover.");
            isEmpty = true;
            top = base = -1;
            return null;
        }
    }

    public void printQueue() {
        if (!isEmpty()) {
            int current = base;
            while (current != top) {
                System.out.print(queue[current] + " ");
                current = move(current);
            }
            System.out.println(queue[current]);
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    private int move(int position) {
        return (position + 1) % size;
    }
}

