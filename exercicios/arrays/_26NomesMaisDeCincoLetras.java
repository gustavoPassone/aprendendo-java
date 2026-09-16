package exercicios.arrays;

import java.util.Scanner;

public class _26NomesMaisDeCincoLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\n=== Nomes com mais de 5 letras ===");
        boolean encontrou = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > 5) {
                System.out.println("- " + nomes[i] + " (" + nomes[i].length() + " letras)");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum nome digitado possui mais de 5 letras.");
        }

        scanner.close();
    }
}
