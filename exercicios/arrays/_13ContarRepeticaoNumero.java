package exercicios.arrays;

import java.util.Scanner;

public class _13ContarRepeticaoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite um número para contar quantas vezes ele aparece: ");
        int numeroPesquisado = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroPesquisado) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroPesquisado + " aparece " + contador + " vezes no array.");

        scanner.close();
    }
}
