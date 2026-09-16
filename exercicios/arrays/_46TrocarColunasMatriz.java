package exercicios.arrays;

import java.util.Scanner;

public class _46TrocarColunasMatriz {
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

        System.out.println("\n=== Matriz Original ===");
        imprimirMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            int temporario = matriz[i][0];
            matriz[i][0] = matriz[i][2];
            matriz[i][2] = temporario;
        }

        System.out.println("\n=== Matriz Apos Trocar Coluna 0 com Coluna 2 ===");
        imprimirMatriz(matriz);

        scanner.close();
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
