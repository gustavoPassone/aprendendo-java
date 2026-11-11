package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest05 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mochila";
        produto.preco = 150.0;
        produto.quantidade = 5;

        double precoComAumento = produto.aumentarPreco(20);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço original: R$ " + produto.preco);
        System.out.println("Preço com aumento (20%): R$ " + precoComAumento);
    }
}

