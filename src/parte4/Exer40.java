package parte4;

public class Exer40 {
    public static void main(String[] args) {
        double salario = 2500.00;
        double bonus = salario < 3000 ? 500 : 200;

        System.out.println("Valor do bônus: R$ " + bonus);
    }
}
