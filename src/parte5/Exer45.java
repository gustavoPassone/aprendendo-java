package parte5;

public class Exer45 {
    public static void main(String[] args) {

        double valorCompra = 400.00;
        double percentualDesconto;

        if (valorCompra <= 100) {
            percentualDesconto = 0;
        } else if (valorCompra <= 300) {
            percentualDesconto = 0.05;
        } else if (valorCompra <= 500) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Porcentagem de desconto: " + (percentualDesconto * 100) + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
