package parte3;

public class Exer26 {
    public static void main(String[] args) {

        int statusPedido = 3;

        if (statusPedido == 1) {
            System.out.println("Pedido recebido");
        } else if (statusPedido == 2) {
            System.out.println("Pedido em preparação");
        } else if (statusPedido == 3) {
            System.out.println("Pedido enviado");
        } else if (statusPedido == 4) {
            System.out.println("Pedido entregue");
        } else {
            System.out.println("Status inválido");
        }
    }
}
