package exercicios.arrays;

import java.util.Scanner;

public class _11BuscarNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o nome que deseja buscar: ");
        String nomePesquisado = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomePesquisado.equalsIgnoreCase(nomes[i])) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O aluno \"" + nomePesquisado + "\" foi encontrado na lista!");
        } else {
            System.out.println("O aluno \"" + nomePesquisado + "\" NÃO foi encontrado na lista.");
        }

        scanner.close();
    }
}
