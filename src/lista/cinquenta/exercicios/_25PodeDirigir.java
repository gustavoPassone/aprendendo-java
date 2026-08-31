package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _25PodeDirigir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Você possui CNH? (true/false): ");
        boolean temCnh = sc.nextBoolean();

        if (idade >= 18 && temCnh) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        sc.close();
    }
}
