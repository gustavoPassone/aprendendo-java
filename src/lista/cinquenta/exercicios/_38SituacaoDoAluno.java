package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _38SituacaoDoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        System.out.print("Digite a porcentagem de presença (%): ");
        double presenca = sc.nextDouble();

        if (nota >= 7.0 && presenca >= 75.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
