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
                System.out.println("-------------------------------------------");
                System.out.println("       Flood Fill com Pilha e Fila         ");
                System.out.println("-------------------------------------------");
                System.out.println("- Digite [1] para selecionar a fila       -");
                System.out.println("- Digite [2] para selecionar a pilha      -");
                System.out.println("- Digite [3] para sair                    -");
                System.out.println("-------------------------------------------");
                System.out.print(" • Digite a opção: ");
                int opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("Digite as coordenadas entre 1 e 10 (coordenadas iguais não são permitidas): ");
                while (true){
                    System.out.print("X(linha): ");
                    int posicao_x_fila = scanner.nextInt();
                    System.out.print("Y(coluna): ");
                    int posicao_y_fila = scanner.nextInt();
                    if(posicao_y_fila > 10 || posicao_y_fila <= 0 || posicao_x_fila > 10 || posicao_x_fila <= 0 || posicao_x_fila == posicao_y_fila){
                        System.out.println("Dados inválidos: Digite um posição entre 1 e 10 e não é permitido coordenadas de valores iguais");
                    }else{
                        matriz.montarMatriz();
                        matriz.floodfillFila((posicao_x_fila - 1), (posicao_y_fila-1));
                        break;
                    }
                }
            }
            if (opcao == 2){
                System.out.println("Digite as coordenadas entre 1 e 10 (coordenadas iguais não são permitidas): ");
                while (true){
                    System.out.print("X(linha): ");
                    int posicao_x_pilha= scanner.nextInt();
                    System.out.print("Y(coluna): ");
                    int posicao_y_pilha = scanner.nextInt();
                    if(posicao_y_pilha > 10 || posicao_y_pilha <= 0 || posicao_x_pilha > 10 || posicao_x_pilha <= 0 || posicao_x_pilha == posicao_y_pilha){
                        System.out.println("Dados Erroneos");
                    }else {
                        matriz.montarMatriz();
                        matriz.fillPilha((posicao_x_pilha -1), (posicao_y_pilha-1));
                        break;
                    }
                }
            }if(opcao==3){
                    System.out.println("tchau!!!");
                    break;
            }else{
                    System.out.println("");
            }
            }catch (InputMismatchException e){
                System.out.println("Dado inválido: ");
                scanner.next();
            }
        }
    
    }
}