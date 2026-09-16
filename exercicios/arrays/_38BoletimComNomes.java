package exercicios.arrays;

import java.util.Scanner;

public class _38BoletimComNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        System.out.println("=== Cadastro de Alunos e Notas ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota " + (j + 1) + " de " + nomes[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        System.out.println("\n================ BOLETIM ESCOLAR ================");
        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;
            StringBuilder notasTexto = new StringBuilder();
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
                notasTexto.append(String.format("%.1f", notas[i][j]));
                if (j < notas[i].length - 1) {
                    notasTexto.append(", ");
                }
            }

            double media = soma / notas[i].length;
            String situacao = (media >= 7.0) ? "Aprovado" : "Reprovado";

            System.out.println(String.format("Aluno: %-12s | Notas: [%s] | Média: %5.2f | Situação: %s",
                    nomes[i], notasTexto.toString(), media, situacao));
        }

        scanner.close();
    }
}
