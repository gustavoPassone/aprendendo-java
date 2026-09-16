package exercicios.arrays;

import java.util.Scanner;

public class _42ContarParesNaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("=== Preenchendo a Matriz 4x4 ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int quantidadePares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }

        System.out.println("\nQuantidade de números pares na matriz: " + quantidadePares);

        scanner.close();
    }
}
