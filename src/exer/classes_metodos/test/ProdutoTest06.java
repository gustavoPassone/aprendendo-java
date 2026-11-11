package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest06 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Headset Sem Fio";
        produto.preco = 250.0;
        produto.quantidade = 4;

        double taxaFrete = 25.0;
        double valorFinal = produto.calcularFrete(taxaFrete);

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Taxa de Frete: R$ " + taxaFrete);
        System.out.println("Valor Final com Frete: R$ " + valorFinal);
    }
}

