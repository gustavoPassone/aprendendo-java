package exercicios.SWITCH;

public class _2CardapioLanchonete {
    public static void main(String[] args) {
        int opcaoLanche = 2;
        int quantidade = 3;

        String itemEscolhido = "";
        double precoUnitario = 0;
        boolean opcaoValida = true;

        switch (opcaoLanche) {
            case 1:
                itemEscolhido = "Hamburguer";
                precoUnitario = 25.00;
                break;
            case 2:
                itemEscolhido = "Pizza";
                precoUnitario = 40.00;
                break;
            case 3:
                itemEscolhido = "Batata frita";
                precoUnitario = 18.00;
                break;
            case 4:
                itemEscolhido = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 5:
                itemEscolhido = "Suco";
                precoUnitario = 10.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Opção invalida");
                break;
        }

        if (opcaoValida) {
            double totalPedido = quantidade * precoUnitario;

            System.out.println("Item escolhido: " + itemEscolhido);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total do pedido: R$ " + totalPedido);
        }
    }
}
