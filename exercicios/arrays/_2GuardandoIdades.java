package exercicios.arrays;

import java.util.Scanner;

public class _2GuardandoIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[6];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        System.out.println("\n=== Idades Digitadas ===");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Pessoa " + (i + 1) + ": " + idades[i] + " anos");
        }

        scanner.close();
    }
}
