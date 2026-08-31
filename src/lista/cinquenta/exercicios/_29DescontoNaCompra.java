package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _29DescontoNaCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double valorFinal;

        if (valorCompra >= 200.0) {
            double desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
        } else {
            valorFinal = valorCompra;
        }

        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
