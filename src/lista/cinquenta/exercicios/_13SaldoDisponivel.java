package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _13SaldoDisponivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: R$ ");
        double saldo = sc.nextDouble();

        if (saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        sc.close();
    }
}
