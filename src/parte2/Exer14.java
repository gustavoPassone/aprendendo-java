package parte2;

public class Exer14 {
    public static void main(String[] args) {

        boolean emailCorreto = true;
        boolean senhaCorreta = true;

        if (emailCorreto && senhaCorreta) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos.");
        }
    }
}
