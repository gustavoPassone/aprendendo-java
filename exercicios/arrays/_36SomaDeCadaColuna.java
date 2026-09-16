package exercicios.arrays;

import java.util.Scanner;

public class _36SomaDeCadaColuna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        System.out.println("=== Preenchendo a Matriz 3x4 ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n=== Soma de Cada Coluna ===");
        int totalColunas = matriz[0].length;
        int totalLinhas = matriz.length;

        for (int j = 0; j < totalColunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < totalLinhas; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da Coluna " + j + ": " + somaColuna);
        }

        scanner.close();
    }
}
