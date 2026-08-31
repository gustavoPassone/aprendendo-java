package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _17CompraComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        sc.close();
    }
}
