package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _14EstoqueProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos no estoque: ");
        int quantidade = sc.nextInt();

        if (quantidade > 0) {
            System.out.println("Produto disponível para venda.");
        }

        sc.close();
    }
}
