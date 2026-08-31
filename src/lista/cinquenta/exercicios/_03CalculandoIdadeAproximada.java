package lista.cinquenta.exercicios;

import java.time.Year;
import java.util.Scanner;

public class _03CalculandoIdadeAproximada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = Year.now().getValue();
        int idadeAproximada = anoAtual - anoNascimento;

        System.out.printf("Sua idade aproximada é: %d anos.%n", idadeAproximada);

        sc.close();
    }
}
