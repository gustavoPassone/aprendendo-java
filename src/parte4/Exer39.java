package parte4;

public class Exer39 {
    public static void main(String[] args) {
        double valorCompra = 200.00;
        double frete = valorCompra >= 150 ? 0 : 20;

        System.out.println("Valor do frete: R$ " + frete);
    }
}
