package program;
import java.util.Scanner;
import fila.matriz.Matriz;



public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(10,10);
 

        while (true){

            System.out.println("Digite [1] para selecionar a fila ou digite [2] para selecionar a pilha: ");
            int opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("Digite as coordenada: ");
                System.out.print("X(linha): ");
                int posicao_x_fila = scanner.nextInt();
                System.out.print("Y(coluna): ");
                int posicao_y_fila = scanner.nextInt();
                matriz.montarMatriz();
                matriz.floodfillFila(posicao_x_fila, posicao_y_fila);
                break;
            }
            if (opcao == 2){
                System.out.println("Digite as coordenada: ");
                System.out.print("X(linha): ");
                int posicao_x_pilha= scanner.nextInt();
                System.out.print("Y(coluna): ");
                int posicao_y_pilha = scanner.nextInt();
                matriz.montarMatriz();
                matriz.fillPilha(posicao_x_pilha, posicao_y_pilha);
                break;
            }
        }
    
    }
}


 

