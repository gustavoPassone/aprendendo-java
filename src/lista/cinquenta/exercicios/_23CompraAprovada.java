package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _23CompraAprovada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = sc.nextDouble();

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}
