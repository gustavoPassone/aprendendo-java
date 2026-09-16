package exercicios.arrays;

import java.util.Scanner;

public class _7ContarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadePares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("\nQuantidade de números pares digitados: " + quantidadePares);

        scanner.close();
    }
}
