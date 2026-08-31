package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _41MaioridadeComTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade." : "Menor de idade.";

        System.out.println(resultado);

        sc.close();
    }
}
