package exercicios.arrays;

import java.util.Scanner;

public class _8ContarImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadeImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                quantidadeImpares++;
            }
        }

        System.out.println("\nQuantidade de números ímpares digitados: " + quantidadeImpares);

        scanner.close();
    }
}
