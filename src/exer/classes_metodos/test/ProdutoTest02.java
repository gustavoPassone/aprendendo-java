package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Monitor Gamer";
        produto.preco = 1200.0;
        produto.quantidade = 8;

        double valorTotal = produto.calcularValorTotal();
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor Total em Estoque: R$ " + valorTotal);
    }
}

