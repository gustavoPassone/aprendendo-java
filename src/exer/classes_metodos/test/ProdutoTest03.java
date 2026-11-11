package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Notebook Dell";
        produto1.preco = 3500.0;
        produto1.quantidade = 3;

        Produto produto2 = new Produto();
        produto2.nome = "Mouse Pad";
        produto2.preco = 50.0;
        produto2.quantidade = 20;

        System.out.println(produto1.nome + " (R$ " + produto1.preco + "): " + produto1.verificarCategoria());
        System.out.println(produto2.nome + " (R$ " + produto2.preco + "): " + produto2.verificarCategoria());
    }
}

