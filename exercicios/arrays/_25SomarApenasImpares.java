package exercicios.arrays;

import java.util.Scanner;

public class _25SomarApenasImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        int somaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                somaImpares += numeros[i];
            }
        }

        System.out.println("\nSoma apenas dos números ímpares: " + somaImpares);

        scanner.close();
    }
}
