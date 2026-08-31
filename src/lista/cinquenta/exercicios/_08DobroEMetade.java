package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _08DobroEMetade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        double dobro = numero * 2.0;
        double metade = numero / 2.0;

        System.out.printf("Número digitado: %.2f%n", numero);
        System.out.printf("Dobro: %.2f%n", dobro);
        System.out.printf("Metade: %.2f%n", metade);

        sc.close();
    }
}
