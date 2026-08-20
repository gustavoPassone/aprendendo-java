package parte2;

public class Exer16 {
    public static void main(String[] args) {

        double valorCompra = 250.00;

        if (valorCompra >= 200) {
            double desconto = valorCompra * 0.10;
            double valorFinal = valorCompra - desconto;

            System.out.println("Valor final: R$ " + valorFinal);
        } else {
            System.out.println("Valor original: R$ " + valorCompra);
        }
    }
}
