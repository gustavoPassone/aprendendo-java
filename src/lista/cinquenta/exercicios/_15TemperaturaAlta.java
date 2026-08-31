package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _15TemperaturaAlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura atual (°C): ");
        double temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Está muito quente hoje.");
        }

        sc.close();
    }
}
