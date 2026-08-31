package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _50PlanoDeAssinatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PLANOS DE ASSINATURA ===");
        System.out.println("1: Básico - R$ 29,90 por mês");
        System.out.println("2: Intermediário - R$ 59,90 por mês");
        System.out.println("3: Premium - R$ 99,90 por mês");

        System.out.print("Escolha o plano (1 a 3): ");
        int plano = sc.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();

        String nomePlano = "";
        double valorMensal = 0.0;
        boolean planoValido = true;

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Intermediário";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                planoValido = false;
                System.out.println("Plano inválido.");
                break;
        }

        if (planoValido) {
            double valorSemDesconto = valorMensal * meses;
            double valorDesconto = 0.0;

            if (meses >= 12) {
                valorDesconto = valorSemDesconto * 0.10;
            }

            double valorFinal = valorSemDesconto - valorDesconto;

            System.out.println("\n--- Resumo do Contrato ---");
            System.out.println("Nome do plano: " + nomePlano);
            System.out.printf("Valor mensal: R$ %.2f%n", valorMensal);
            System.out.println("Quantidade de meses: " + meses);
            System.out.printf("Valor sem desconto: R$ %.2f%n", valorSemDesconto);
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor final do contrato: R$ %.2f%n", valorFinal);
        }

        sc.close();
    }
}
