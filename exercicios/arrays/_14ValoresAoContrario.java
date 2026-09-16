package exercicios.arrays;

import java.util.Scanner;

public class _14ValoresAoContrario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\n=== Valores na Ordem Inversa ===");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Posição [" + i + "]: " + numeros[i]);
        }

        scanner.close();
    }
}
