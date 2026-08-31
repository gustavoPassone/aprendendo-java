package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _48CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("=== OPERAÇÕES ===");
        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");

        System.out.print("Escolha a operação (1 a 4): ");
        int operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                double soma = numero1 + numero2;
                System.out.printf("Resultado da Soma: %.2f%n", soma);
                break;
            case 2:
                double subtracao = numero1 - numero2;
                System.out.printf("Resultado da Subtração: %.2f%n", subtracao);
                break;
            case 3:
                double multiplicacao = numero1 * numero2;
                System.out.printf("Resultado da Multiplicação: %.2f%n", multiplicacao);
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.printf("Resultado da Divisão: %.2f%n", divisao);
                } else {
                    System.out.println("Erro: Não é possível realizar divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação invalida.");
                break;
        }

        sc.close();
    }
}
