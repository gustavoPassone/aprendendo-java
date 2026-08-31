package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _37DescontoProgressivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorOriginal = sc.nextDouble();

        double porcentagemDesconto;

        if (valorOriginal <= 100.0) {
            porcentagemDesconto = 0.0;
        } else if (valorOriginal <= 300.0) {
            porcentagemDesconto = 0.05;
        } else if (valorOriginal <= 500.0) {
            porcentagemDesconto = 0.10;
        } else {
            porcentagemDesconto = 0.15;
        }

        double valorDesconto = valorOriginal * porcentagemDesconto;
        double valorFinal = valorOriginal - valorDesconto;

        System.out.printf("Valor original: R$ %.2f%n", valorOriginal);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", (porcentagemDesconto * 100), valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
