package exercicios.arrays;

import java.util.Scanner;

public class _17AprovadosEReprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("\n=== Resultado da Turma ===");
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

        scanner.close();
    }
}
