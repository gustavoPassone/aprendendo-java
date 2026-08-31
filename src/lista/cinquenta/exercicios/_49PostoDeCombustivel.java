package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _49PostoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== OPÇÕES DE COMBUSTÍVEL ===");
        System.out.println("1: Gasolina - R$ 5,80");
        System.out.println("2: Etanol - R$ 4,20");
        System.out.println("3: Diesel - R$ 6,00");

        System.out.print("Escolha o tipo de combustivel (1 a 3): ");
        int tipo = sc.nextInt();

        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        String nomeCombustivel = "";
        double precoPorLitro = 0.0;
        boolean opcaoValida = true;

        switch (tipo) {
            case 1:
                nomeCombustivel = "Gasolina";
                precoPorLitro = 5.80;
                break;
            case 2:
                nomeCombustivel = "Etanol";
                precoPorLitro = 4.20;
                break;
            case 3:
                nomeCombustivel = "Diesel";
                precoPorLitro = 6.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Tipo de combustivel invalido.");
                break;
        }

        if (opcaoValida) {
            double totalPagar = litros * precoPorLitro;
            System.out.printf("Combustivel: %s | Litros: %.2f | Total a pagar: R$ %.2f%n", nomeCombustivel, litros, totalPagar);
        }

        sc.close();
    }
}
