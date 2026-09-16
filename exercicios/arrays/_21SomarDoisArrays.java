package exercicios.arrays;

import java.util.Scanner;

public class _21SomarDoisArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] soma = new int[5];

        System.out.println("=== Digite os 5 valores do Primeiro Array ===");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Array 1 - Posição [" + i + "]: ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("\n=== Digite os 5 valores do Segundo Array ===");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Array 2 - Posição [" + i + "]: ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < soma.length; i++) {
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("\n=== Resultado da Soma dos Dois Arrays ===");
        for (int i = 0; i < soma.length; i++) {
            System.out.println("Posição [" + i + "]: " + array1[i] + " + " + array2[i] + " = " + soma[i]);
        }

        scanner.close();
    }
}
