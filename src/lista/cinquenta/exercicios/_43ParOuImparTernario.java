package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _43ParOuImparTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "ímpar";

        System.out.printf("O número %d é %s.%n", numero, resultado);

        sc.close();
    }
}
