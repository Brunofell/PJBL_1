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

    public void adicionar(T value) {
        //Se o topo for menor que a pilha e ela não estiver cheia, adiciona um valor no topo e aumenta o indíce dele
        if (!estaCheia()){
            stack[top + 1] = value;
            top++;
            if (top == size - 1){
                isFull = true;
            }
        } else{;
            System.out.println("A pilha está cheia. Não é possível adicionar.");
        }
    }

    public T remover() {
        if (!estaVazia()) {
            T value = stack[top];
            stack[top] = null;
            top--;
            isFull = false; // Remover um elemento não significa que a pilha está cheia
            return value;
        } else {
            System.out.println("A pilha está vazia. Não é possível remover.");
            return null;
        }
    }


    //Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return top == -1;
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

