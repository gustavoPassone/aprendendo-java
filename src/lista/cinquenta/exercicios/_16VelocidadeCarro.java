package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _16VelocidadeCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do veículo (km/h): ");
        double velocidade = sc.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado.");
        }

        sc.close();
    }
}
