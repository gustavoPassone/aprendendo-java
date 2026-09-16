package exercicios.arrays;

import java.util.Scanner;

public class _49VendasPorVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        double[] totais = new double[3];

        System.out.println("=== Registro de Vendas (3 vendedores, 4 vendas cada) ===");
        for (int i = 0; i < vendas.length; i++) {
            System.out.println("\nVendedor " + (i + 1) + ":");
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Digite o valor da venda " + (j + 1) + ": R$ ");
                vendas[i][j] = scanner.nextDouble();
                totais[i] += vendas[i][j];
            }
        }

        System.out.println("\n=== Total Vendido por Vendedor ===");
        int melhorVendedor = 0;
        double maiorTotal = totais[0];

        for (int i = 0; i < totais.length; i++) {
            System.out.println(String.format("Vendedor %d - Total: R$ %.2f", (i + 1), totais[i]));
            if (totais[i] > maiorTotal) {
                maiorTotal = totais[i];
                melhorVendedor = i;
            }
        }

        System.out.println(String.format("\nO vendedor que mais vendeu foi o Vendedor %d com R$ %.2f em vendas!",
                (melhorVendedor + 1), maiorTotal));

        scanner.close();
    }
}
