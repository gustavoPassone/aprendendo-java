package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _02CadastroSimplesAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();

        System.out.print("Digite a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        System.out.printf("Aluno: %s | Idade: %d anos | Nota Final: %.1f%n", nome, idade, notaFinal);

        sc.close();
    }
}
