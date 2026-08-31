package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _22AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        if (notaFinal >= 7.0) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
