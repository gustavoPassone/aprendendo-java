package exercicios.SWITCH;

public class _12CardapioLanchoneteDesafio {
    public static void main(String[] args) {
        int opcaoLanche = 2;
        int quantidade = 2;
        int tipoEntrega = 2;
        String cupom = "LANCHE10";

        String itemEscolhido = "";
        double precoUnitario = 0;
        boolean opcaoValida = true;

        // quantidade minima de 1
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade deve ser de no minimo 1 unidade.");
            opcaoValida = false;
        } else {
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
                    System.out.println("Opção de lanche invalida");
                    break;
            }
        }

        if (opcaoValida) {
            double subtotal = quantidade * precoUnitario;
            double descontoCupom = 0.0;

            // cupom de desconto
            if (cupom.equalsIgnoreCase("LANCHE10")) {
                descontoCupom = subtotal * 0.10;
            }

            // taxa de entrega
            double taxaEntrega = 0.0;
            String descricaoEntrega = "";
            switch (tipoEntrega) {
                case 1:
                    descricaoEntrega = "Retirada no Balcão";
                    taxaEntrega = 0.0;
                    break;
                case 2:
                    descricaoEntrega = "Delivery";
                    // frete gratis acima de 60
                    if (subtotal >= 60.00) {
                        taxaEntrega = 0.0;
                        descricaoEntrega += " (Frete Grátis acima de R$ 60)";
                    } else {
                        taxaEntrega = 7.50;
                    }
                    break;
                default:
                    System.out.println("Opção de entrega inválida. Definindo como Retirada.");
                    descricaoEntrega = "Retirada no Balcão";
                    taxaEntrega = 0.0;
                    break;
            }

            double totalPedido = (subtotal - descontoCupom) + taxaEntrega;

            System.out.println("=== DETALHES DO PEDIDO ===");
            System.out.println("Item: " + itemEscolhido);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Subtotal itens: R$ " + String.format("%.2f", subtotal));
            if (descontoCupom > 0) {
                System.out.println("Cupom " + cupom + " (10%): -R$ " + String.format("%.2f", descontoCupom));
            }
            System.out.println("Modalidade de Entrega: " + descricaoEntrega);
            System.out.println("Taxa de entrega: R$ " + String.format("%.2f", taxaEntrega));
            System.out.println("Total a pagar: R$ " + String.format("%.2f", totalPedido));
        }
    }
}
