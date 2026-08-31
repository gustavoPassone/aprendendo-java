package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _11EntradaNoEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Entrada permitida.");
        }

        sc.close();
    }
}
