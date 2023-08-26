package fila;

public class Fila <T>{

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

    //Explicação sobre o que eu mudei no0 add():
    // ele recebe um valor do tipo Generics, dai ele verifica se o top(o topo da fila que nem a marina disse)
    // ta no limite máximo (top == tamanhoMaximo - 1), dai se ele tiver significa que a fila ta cheia,
    // dai ele reinicia o top pra -1 (top = -1;) , colocando o indice no inicio da fila circular
    // dai o elemento é adicionado na posição ++top no array data. so isso
    public void add(T value) {
        if (top == tamanhoMaximo - 1) {
            top = -1;
        }
        data[++top] = value;
    }

    // Agora aqui no remove, ele remove um elemento e retorna esse elemento basicamente
    // Aqui: (Integer temp = (Integer) data[base++];) - nessa parte o elemento
    // é pego a partir da posição base++ do array data, base é o inicio da fila,
    // o base++ atribui o valor a variavel temp, depois a gente esta incrementado a base,
    // pra ela apontar pro próximo elemento da fila pra proxima chamada do remove.

    //if (temp == null) - Essa parte tem que arruma, mas so quando estiver tudo funcionando
    // é pq ele no final do programa da retornando null, dai ta sinalizando essa exception
    //NullPointerException, mas eu vou tratar ela depois <:

    //if (base == tamanhoMaximo) - aqui é pra garantir que a base não
    // vai passar o tamanhoMaximo da fila. Tipo se a base for igual ao tamanho da fila,
    // é tipo como se tivesse chegando no final do array, pelo que entendi,
    // dai ele reinicia a base para 0 para ela funcionar como uma fila circular

    // return temp.intValue(); - aqui se der tudo certo, o metodo retorna o valor do elemento removido
    // o método intValue() é usado para obter o valor primitivo int do objeto Integer,
    // dai como a fila é do tipo <T> o temp foi denominado
    // como Integer e o Array data foi castado como Integer
    public Integer remove() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível remover.");
            return null;
        }

        Integer temp = (Integer) data[base];
        data[base] = null;
        base = move(base);
        return temp;
    }




    // Ja aqui, verifica se a fila tá vazia comparando o valor de top com -1,
    //se ele for -1(que é quando não tem nada na fila) retorna true, senão retorna false ;-;
    public boolean isEmpty() {
        return top == -1;
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

