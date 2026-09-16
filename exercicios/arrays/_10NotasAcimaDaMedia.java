package exercicios.arrays;

import java.util.Scanner;

public class _10NotasAcimaDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println(String.format("\nMédia da turma: %.2f", media));
        System.out.println("Notas acima da média:");

        boolean existeAcima = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(String.format("- Nota %d: %.2f", (i + 1), notas[i]));
                existeAcima = true;
            }
        }

        if (!existeAcima) {
            System.out.println("Nenhuma nota ficou acima da média.");
        }

        scanner.close();
    }
}
