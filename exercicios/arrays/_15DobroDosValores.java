package exercicios.arrays;

import java.util.Scanner;

public class _15DobroDosValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\n=== Dobro de Cada Número ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O dobro de " + numeros[i] + " é " + (numeros[i] * 2));
        }

        scanner.close();
    }
}
