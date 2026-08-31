package flamingo.aula.revisao.entradas;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");

        nome = sc.nextLine();

        System.out.printf("Olá %s, escute!", nome);

        sc.close();
    }
}