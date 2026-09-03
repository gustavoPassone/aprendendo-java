package flamingo.aprendendo.basico.repeticao;

public class Exercicio8 {
    static void main(String[] args) {
        int quantidadeProdutos = 10;
        double valorProduto = 100.0;
        double totalCompra = 0.0;

        for (int i = 0; i < quantidadeProdutos; i++) {
            totalCompra += valorProduto;
        }

        System.out.println("Quantidade de produtos: R$ " + quantidadeProdutos);
        System.out.println("Valor de cada produto: R$ " + valorProduto);
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
