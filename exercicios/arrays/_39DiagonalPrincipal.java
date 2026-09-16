package exercicios.arrays;

import java.util.Scanner;

public class _39DiagonalPrincipal {
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

        System.out.println("\n=== Elementos da Diagonal Principal ===");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Posição [" + i + "][" + i + "]: " + matriz[i][i]);
        }

        scanner.close();
    }
}
