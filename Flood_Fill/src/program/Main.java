package program;
import java.util.Scanner;
import fila.matriz.Matriz;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(10,10);
        matriz.montarMatriz();
        while (true){
            System.out.println("Digite [1] para selecionar a fila ou digite [2] para selecionar a pilha: ");
            int opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Digite as coordenada: ");
                System.out.print("X(linha): ");
                int x = scanner.nextInt();
                System.out.print("Y(coluna): ");
                int y = scanner.nextInt();
                break;
            }
            if (opcao == 2){
                System.out.println("Digite as coordenada: ");
                System.out.print("X(linha): ");
                int x = scanner.nextInt();
                System.out.print("Y(coluna): ");
                int y = scanner.nextInt();
                matriz.fillPilha(x,y);
                break;
            }
        }
    }
}
