package exercicios.arrays;

import java.util.Scanner;

public class _47MultiplicarMatrizPorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("=== Preenchendo a Matriz 3x3 ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite o número multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\n=== Matriz Multiplicada por " + multiplicador + " ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int resultado = matriz[i][j] * multiplicador;
                System.out.print(resultado + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
