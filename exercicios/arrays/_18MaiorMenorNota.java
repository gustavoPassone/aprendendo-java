package exercicios.arrays;

import java.util.Scanner;

public class _18MaiorMenorNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[6];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\n=== Estatisticas das Notas ===");
        System.out.println(String.format("Maior nota: %.2f", maior));
        System.out.println(String.format("Menor nota: %.2f", menor));
        System.out.println(String.format("Media da turma: %.2f", media));

        scanner.close();
    }
}
