package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _35NivelDoJogador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de XP do jogador: ");
        int xp = sc.nextInt();

        if (xp < 1000) {
            System.out.println("Iniciante");
        } else if (xp <= 4999) {
            System.out.println("Intermediário");
        } else if (xp <= 9999) {
            System.out.println("Avançado");
        } else {
            System.out.println("Lendário");
        }

        sc.close();
    }
}
