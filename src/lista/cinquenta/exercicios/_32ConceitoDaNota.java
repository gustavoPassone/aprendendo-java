package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _32ConceitoDaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 9.0) {
            System.out.println("Excelente");
        } else if (nota >= 7.0) {
            System.out.println("Bom");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
