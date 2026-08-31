package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _26FreteGratis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 150.0) {
            System.out.println("Frete grátis.");
        } else {
            System.out.println("Frete de R$ 20,00.");
        }

        sc.close();
    }
}
