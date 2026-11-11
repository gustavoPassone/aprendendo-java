package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Camiseta";
        produto.preco = 100.0;
        produto.quantidade = 10;

        double precoComDesconto = produto.aplicarDesconto(10);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço original: R$ " + produto.preco);
        System.out.println("Preço com desconto (10%): R$ " + precoComDesconto);
    }
}

