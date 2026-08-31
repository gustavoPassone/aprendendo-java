package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _39CategoriaDoAtleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = sc.nextInt();

        if (idade <= 10) {
            System.out.println("Infantil");
        } else if (idade <= 15) {
            System.out.println("Juvenil");
        } else if (idade <= 20) {
            System.out.println("Júnior");
        } else if (idade <= 35) {
            System.out.println("Profissional");
        } else {
            System.out.println("Sênior");
        }

        sc.close();
    }
}
