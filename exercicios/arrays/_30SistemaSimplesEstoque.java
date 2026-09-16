package exercicios.arrays;

import java.util.Scanner;

public class _30SistemaSimplesEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        System.out.println("=== Cadastro de Produtos e Estoque ===");
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();

            System.out.print("Digite a quantidade em estoque de " + produtos[i] + ": ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\n=== Produtos com Estoque Baixo (menos de 5 unidades) ===");
        boolean temEstoqueBaixo = false;

        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + produtos[i] + " | Quantidade: " + quantidades[i] + " unidades.");
                temEstoqueBaixo = true;
            }
        }

        if (!temEstoqueBaixo) {
            System.out.println("Nenhum produto está com estoque abaixo de 5 unidades.");
        }

        scanner.close();
    }
}
