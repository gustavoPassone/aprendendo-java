package parte5;

public class Exer43 {
    public static void main(String[] args) {

        int idade = 20;
        boolean temCarteirinhaEstudante = true;

        if (idade < 12) {
            System.out.println("Paga meia");
        } else if (temCarteirinhaEstudante) {
            System.out.println("Paga meia");
        } else {
            System.out.println("Paga inteira");
        }
    }
}
