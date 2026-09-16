package exercicios.arrays;

import java.util.Scanner;

public class _12BuscarNumeroEPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite um número para pesquisar: ");
        int numeroPesquisado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroPesquisado) {
                System.out.println("Número " + numeroPesquisado + " encontrado na posição (indice): " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroPesquisado + " não foi encontrado no array.");
        }

        scanner.close();
    }
}
