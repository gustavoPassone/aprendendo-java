package exercicios.SWITCH;

public class SistemaPedidosAdicional {
    public static void main(String[] args) {
        int produto = 1;
        int quantidade = 2;
        boolean temAdicional = true;

        String nomeProduto = "";
        double precoUnitario = 0;
        boolean produtoValido = true;

        switch (produto) {
            case 1:
                nomeProduto = "Açaí";
                precoUnitario = 18.00;
                break;
            case 2:
                nomeProduto = "Sorvete";
                precoUnitario = 12.00;
                break;
            case 3:
                nomeProduto = "Milkshake";
                precoUnitario = 20.00;
                break;
            default:
                produtoValido = false;
                System.out.println("Produto inválido");
                break;
        }

        if (produtoValido) {
            double valorAdicionalPorUnidade = 0.0;

            if (temAdicional) {
                valorAdicionalPorUnidade = 5.00;
            }

            double valorTotal = (quantidade * precoUnitario) + (quantidade * valorAdicionalPorUnidade);
            String adicionalTexto = temAdicional ? "Sim" : "Não";

            System.out.println("Produto escolhido: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Adicional: " + adicionalTexto);
            System.out.println("Valor total: R$ " + valorTotal);
        }
    }
}
