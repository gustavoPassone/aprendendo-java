package parte3;

public class Exer30 {
    public static void main(String[] args) {

        int tipoCliente = 3;
        double valorCompra = 200.00;
        double desconto;
        double valorFinal;

        if (tipoCliente == 1) {
            desconto = 0.0;
        } else if (tipoCliente == 2) {
            desconto = 0.05;
        } else if (tipoCliente == 3) {
            desconto = 0.10;
        } else if (tipoCliente == 4) {
            desconto = 0.15;
        } else {
            desconto = 0.0;
        }

        valorFinal = valorCompra - (valorCompra * desconto);

        System.out.println("Valor final: R$ " + valorFinal);
    }
}
