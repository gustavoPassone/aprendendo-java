package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _10DadosFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        System.out.print("Digite o salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("O funcionário está ativo? (true/false): ");
        boolean ativo = sc.nextBoolean();

        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Ativo na empresa: " + (ativo ? "Sim" : "Não"));

        sc.close();
    }
}
