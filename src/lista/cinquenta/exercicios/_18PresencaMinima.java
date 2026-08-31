package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _18PresencaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a porcentagem de presença do aluno (%): ");
        double presenca = sc.nextDouble();

        if (presenca >= 75) {
            System.out.println("Presença suficiente.");
        }

        sc.close();
    }
}
