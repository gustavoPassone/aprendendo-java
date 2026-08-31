package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _34ClimaDoDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura (°C): ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15.0) {
            System.out.println("Frio");
        } else if (temperatura <= 25.0) {
            System.out.println("Agradável");
        } else if (temperatura <= 35.0) {
            System.out.println("Quente");
        } else {
            System.out.println("Muito quente");
        }

        sc.close();
    }
}
