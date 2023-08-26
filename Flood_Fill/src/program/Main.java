package program;
import matriz.Matriz;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz(10,10);
        matriz.montaMatriz();
        System.out.println("Digite as coordenada: ");
        System.out.print("X(linha): ");
        int x = scanner.nextInt();
        System.out.print("Y(coluna): ");
        int y = scanner.nextInt();

        matriz.floodfill(x,y);

    }

}
