package exercicios.arrays;

import java.util.Scanner;

public class _22CompararDoisArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

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

        boolean iguais = true;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
                break;
            }
        }

        System.out.println("\n=== Resultado da Comparação ===");
        if (iguais) {
            System.out.println("Os dois arrays são exatamente iguais!");
        } else {
            System.out.println("Os dois arrays são diferentes.");
        }

        scanner.close();
    }
}
