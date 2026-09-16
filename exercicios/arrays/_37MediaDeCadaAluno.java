package exercicios.arrays;

import java.util.Scanner;

public class _37MediaDeCadaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[4][3];

        System.out.println("=== Cadastro de Notas (4 alunos, 3 notas cada) ===");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n=== Média Final de Cada Aluno ===");
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.println(String.format("Aluno %d - Média: %.2f", (i + 1), media));
        }

        scanner.close();
    }
}
