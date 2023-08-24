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
        this.top = -1;
        this.isFull = false;
        this.isEmpty = true;
    }

    public void add(T value) {
        if (top < this.stack.length && !isFull()) {
            stack[++top] = value;
            isEmpty = false; // set to false when adding an element
        } else{; // set to true when the stack is full
            System.out.println("A pilha está cheia. Não é possível adicionar.");
        }
    }

    public T remover() {
        if (!isEmpty()) {  // Verifique se a pilha não está vazia antes de tentar remover
            T a = stack[top];
            stack[top] = null;  // Defina o elemento no topo como 0 (opcional, mas comum)
            top--;  // Reduza o índice do topo para apontar para o próximo elemento
            isFull=false;
            return a;

        } else {
            System.out.println("A pilha está vazia. Não é possível remover.");
            return null;  // Ou você pode lançar uma exceção, dependendo do seu design.
        }
    }
    public void printStack() {
        System.out.println("Stack:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }






    public boolean isEmpty() {
        return isEmpty; // simplified
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    public void clear() {
        top = -1;
        isEmpty = true; // set to true when clearing the stack
        isFull = false; // set to false when clearing the stack
    }


}

