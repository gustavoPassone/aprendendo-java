package exercicios.arrays;

import java.util.Scanner;

public class _16SegundoArrayComDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] dobros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            dobros[i] = numeros[i] * 2;
        }

        System.out.println("\n=== Comparação de Arrays ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Original: " + numeros[i] + " | Dobro: " + dobros[i]);
        }

        scanner.close();
    }
}
