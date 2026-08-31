package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _44FreteComTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double frete = (valorCompra >= 150.0) ? 0.0 : 20.0;
        double valorTotal = valorCompra + frete;

        System.out.printf("Valor do frete: R$ %.2f%n", frete);
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
