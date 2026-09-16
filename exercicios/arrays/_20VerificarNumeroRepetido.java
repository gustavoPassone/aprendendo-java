package exercicios.arrays;

import java.util.Scanner;

public class _20VerificarNumeroRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        boolean temRepetido = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    temRepetido = true;
                    break;
                }
            }
            if (temRepetido) {
                break;
            }
        }

        if (temRepetido) {
            System.out.println("\nExiste pelo menos um número repetido no array.");
        } else {
            System.out.println("\nNão existem números repetidos no array.");
        }

        scanner.close();
    }
}
