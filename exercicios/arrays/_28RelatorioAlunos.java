package exercicios.arrays;

import java.util.Scanner;

public class _28RelatorioAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\n=== Relatorio de Alunos ===");
        for (int i = 0; i < nomes.length; i++) {
            String situacao = (notas[i] >= 7.0) ? "Aprovado" : "Reprovado";
            System.out.println(String.format("Aluno: %-15s | Nota: %5.2f | Situação: %s", nomes[i], notas[i], situacao));
        }

        scanner.close();
    }
}
