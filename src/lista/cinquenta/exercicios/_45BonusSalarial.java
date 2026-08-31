package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _45BonusSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = sc.nextDouble();

        double bonus = (salario < 3000.0) ? 500.0 : 200.0;
        double valorTotal = salario + bonus;

        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
