package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _04ProdutoComprado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Digite o valor unitário do produto: R$ ");
        double valorUnitario = sc.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.printf("Produto: %s | Quantidade: %d | Total da compra: R$ %.2f%n", nomeProduto, quantidade, valorTotal);

        sc.close();
    }
}
