package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _09Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.printf("%.2f °C equivalem a %.2f °F.%n", celsius, fahrenheit);

        sc.close();
    }
}
