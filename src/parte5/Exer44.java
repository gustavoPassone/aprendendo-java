package parte5;

public class Exer44 {
    public static void main(String[] args) {

        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        boolean contaAtiva = true;

        if (!contaAtiva) {
            System.out.println("Conta bloqueada");
        } else if (!emailCorreto || !senhaCorreta) {
            System.out.println("Dados inválidos");
        } else {
            System.out.println("Login realizado");
        }
    }

}
