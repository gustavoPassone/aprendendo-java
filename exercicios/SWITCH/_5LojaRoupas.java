package exercicios.SWITCH;

public class _5LojaRoupas {
    public static void main(String[] args) {
        int tipoProduto = 1;
        int quantidade = 3;

        String nomeProduto = "";
        double precoUnitario = 0;
        boolean produtoValido = true;

        switch (tipoProduto) {
            case 1:
                nomeProduto = "Camiseta";
                precoUnitario = 49.90;
                break;
            case 2:
                nomeProduto = "Calça";
                precoUnitario = 119.90;
                break;
            case 3:
                nomeProduto = "Jaqueta";
                precoUnitario = 199.90;
                break;
            case 4:
                nomeProduto = "Tênis";
                precoUnitario = 249.90;
                break;
            default:
                produtoValido = false;
                System.out.println("Produto invalido");
                break;
        }

        if (produtoValido) {
            double valorBruto = quantidade * precoUnitario;
            double valorFinal = valorBruto;
            String descontoAplicado = "0%";

            if (quantidade >= 3) {
                double desconto = valorBruto * 0.15;
                valorFinal = valorBruto - desconto;
                valorFinal = Math.round(valorFinal * 1000.0) / 1000.0;
                descontoAplicado = "15%";
            }

            System.out.println("Produto escolhido: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Desconto aplicado: " + descontoAplicado);
            System.out.println("Valor final: R$ " + valorFinal);
        }
    }
}
