package program;
import java.util.InputMismatchException;
import java.util.Scanner;
import fila.matriz.Matriz;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(10,10);


        while (true){
            try{

                System.out.println("Digite [1] para selecionar a fila");
                System.out.println("Digite [2] para selecionar a pilha ");
                System.out.println("Digite [3] para sair");
                System.out.println();
                System.out.print("Digite a opção: ");
                int opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Digite as coordenada: ");
                System.out.print("X(linha): ");
                int posicao_x_fila = scanner.nextInt();
                System.out.print("Y(coluna): ");
                int posicao_y_fila = scanner.nextInt();
                matriz.montarMatriz();
                matriz.floodfillFila(posicao_x_fila, posicao_y_fila);
            }
            if (opcao == 2){
                System.out.println("Digite as coordenada: ");
                System.out.print("X(linha): ");
                int posicao_x_pilha= scanner.nextInt();
                System.out.print("Y(coluna): ");
                int posicao_y_pilha = scanner.nextInt();
                matriz.montarMatriz();
                matriz.fillPilha(posicao_x_pilha, posicao_y_pilha);

            }if(opcao==3){
                    System.out.println("tchau!!!");
                    break;
            }else{
                    System.out.println("Dado inválido! Tente novamente:");
            }
            }catch (InputMismatchException e){
                System.out.println("Dado inválido: ");
                scanner.next();
            }
        }
    
    }
}


 

