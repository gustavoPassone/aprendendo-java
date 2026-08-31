package lista.cinquenta.exercicios;

import java.util.Scanner;

public class _27LoginSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if ("admin@email.com".equals(email) && "123456".equals(senha)) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos.");
        }

        sc.close();
    }
}
