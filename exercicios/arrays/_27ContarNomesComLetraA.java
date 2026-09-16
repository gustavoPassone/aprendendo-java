package exercicios.arrays;

import java.util.Scanner;

public class _27ContarNomesComLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i].trim();
            if (!nome.isEmpty()) {
                char primeiraLetra = Character.toUpperCase(nome.charAt(0));
                if (primeiraLetra == 'A') {
                    contador++;
                }
            }
        }

        System.out.println("\nQuantidade de nomes que começam com a letra A: " + contador);

        scanner.close();
    }
}
