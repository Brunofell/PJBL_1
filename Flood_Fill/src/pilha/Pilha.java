package pilha;


public class Pilha<T> {
    private int size;
    private int top;
    private T[] stack;

    private boolean isFull;
    private boolean isEmpty;

    public Pilha(int size) {
        this.stack = (T[]) new Object[size];
        this.size = size;
        this.top = -1;          //Topo = -1 significa que a pilha está vazia
        this.isFull = false;
        this.isEmpty = true;
    }
   public void add(T element) {
        if (top < size - 1) {
            stack[++top] = element;
            isEmpty = false;
            isFull = top == size - 1;
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar.");
        }
    }

    public T remover() {
        if (top >= 0) {
            T temp = stack[top--];
            isEmpty = top == -1;
            return temp;
        } else {
            System.out.println("A pilha está vazia. Não é possível remover.");
            return null;
        }
    }

    //Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return isEmpty; 
    }

    //Método para verificar se a pilha está cheia
    public boolean estaCheia() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    //Método para limpar a pilha
    public void limpar() {
        for (int i = 0; i <= top; i++) {
            stack[i] = null;  
        }

        top = -1;  
        isEmpty = true;  
        isFull = false;  
    }

}

