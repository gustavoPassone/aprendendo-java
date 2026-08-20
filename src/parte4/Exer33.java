package parte4;

public class Exer33 {
    public static void main(String[] args) {

        double saldo = 100.00;
        double valorProduto = 80.00;

        String resultado = saldo >= valorProduto
                ? "Compra aprovada"
                : "Saldo insuficiente";

        System.out.println(resultado);
    }
}
