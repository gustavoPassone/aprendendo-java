package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _06ConversorMetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100.0;

        System.out.printf("%.2f metros equivalem a %.2f centímetros.%n", metros, centimetros);

        sc.close();
    }
}
