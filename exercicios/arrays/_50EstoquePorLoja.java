package exercicios.arrays;

import java.util.Scanner;

public class _50EstoquePorLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] estoque = new int[3][5];
        int[] totalPorLoja = new int[3];
        int[] totalPorProduto = new int[5];

        System.out.println("=== Cadastro de Estoque (3 lojas, 5 produtos) ===");
        for (int i = 0; i < estoque.length; i++) {
            System.out.println("\n--- Loja " + (i + 1) + " ---");
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Quantidade do Produto " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
                totalPorLoja[i] += estoque[i][j];
                totalPorProduto[j] += estoque[i][j];
            }
        }

        System.out.println("\n=== Total de Produtos por Loja ===");
        int lojaComMaisEstoque = 0;
        int maiorEstoque = totalPorLoja[0];

        for (int i = 0; i < totalPorLoja.length; i++) {
            System.out.println("Loja " + (i + 1) + ": " + totalPorLoja[i] + " produtos no estoque");
            if (totalPorLoja[i] > maiorEstoque) {
                maiorEstoque = totalPorLoja[i];
                lojaComMaisEstoque = i;
            }
        }

        System.out.println("\n=== Total de Cada Produto (Todas as Lojas) ===");
        for (int j = 0; j < totalPorProduto.length; j++) {
            System.out.println("Produto " + (j + 1) + ": " + totalPorProduto[j] + " unidades");
        }

        System.out.println("\n=== Loja com Maior Estoque ===");
        System.out.println("A Loja " + (lojaComMaisEstoque + 1) + " possui o maior estoque com um total de " + maiorEstoque + " produtos!");

        scanner.close();
    }
}
