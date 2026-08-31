package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _28CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do saque: R$ ");
        double valorSaque = sc.nextDouble();

        if (valorSaque <= saldo) {
            double saldoRestante = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso.");
            System.out.printf("Saldo restante: R$ %.2f%n", saldoRestante);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}
