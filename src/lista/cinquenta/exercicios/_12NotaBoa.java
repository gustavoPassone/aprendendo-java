package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _12NotaBoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}
