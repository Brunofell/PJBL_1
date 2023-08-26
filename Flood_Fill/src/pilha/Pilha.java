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

        if (top < this.stack.length && !estaCheia())  { 
            stack[++top] = value;       
            isEmpty = false; 
        } else{; 
            System.out.println("A pilha está cheia. Não é possível adicionar.");
        }
    }

    public T remover() {

        //Se a pilha não estiver vazia, ele vai remover o valor localizado no topo, vai diminuir o indíce do top e vai definir o isfull como falso, além de retornar o valor removido.

        if (!estaVazia()) {  
            T a = stack[top];
            stack[top] = null;  
            top--;  
            isFull=false;
            return a;

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

