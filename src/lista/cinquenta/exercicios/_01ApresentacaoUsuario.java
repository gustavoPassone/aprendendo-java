package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _01ApresentacaoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a sua cidade: ");
        String cidade = sc.nextLine();

        System.out.printf("Olá! Meu nome é %s, tenho %d anos e moro em %s.%n", nome, idade, cidade);

        sc.close();
    }
}
