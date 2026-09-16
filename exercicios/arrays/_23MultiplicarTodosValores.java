package exercicios.arrays;

import java.util.Scanner;

public class _23MultiplicarTodosValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o valor multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\n=== Valores Multiplicados por " + multiplicador + " ===");
        for (int i = 0; i < numeros.length; i++) {
            int resultado = numeros[i] * multiplicador;
            System.out.println(numeros[i] + " x " + multiplicador + " = " + resultado);
        }

        scanner.close();
    }
}
