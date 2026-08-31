package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _07SalarioPorHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor recebido por hora: R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.printf("Salário bruto a receber: R$ %.2f%n", salarioBruto);

        sc.close();
    }
}
