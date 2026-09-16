package exercicios.arrays;

import java.util.Scanner;

public class _44BuscarValorNaMatriz {
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

        System.out.print("\nDigite o número que deseja pesquisar: ");
        int numeroPesquisado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroPesquisado) {
                    System.out.println("Número " + numeroPesquisado + " encontrado na Linha " + i + ", Coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroPesquisado + " não foi encontrado na matriz.");
        }

        scanner.close();
    }
}
