package parte5;

public class Exer42 {
    public static void main(String[] args) {

        double saldo = 50.00;
        double valorProduto = 100.00;
        boolean clienteVip = true;

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada");
        } else if (clienteVip) {
            System.out.println("Compra aprovada pelo crédito VIP");
        } else {
            System.out.println("Compra recusada");
        }
    }
}
