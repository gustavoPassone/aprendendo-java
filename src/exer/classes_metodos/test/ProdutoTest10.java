package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ComparadorProduto;
import exer.classes_metodos.dominio.Produto;

public class ProdutoTest10 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "PlayStation 5";
        produto1.preco = 3800.0;
        produto1.quantidade = 4;

        Produto produto2 = new Produto();
        produto2.nome = "Nintendo Switch";
        produto2.preco = 2200.0;
        produto2.quantidade = 6;

        ComparadorProduto comparador = new ComparadorProduto();
        Produto maisCaro = comparador.retornarProdutoMaisCaro(produto1, produto2);

        System.out.println("Produto 1: " + produto1.nome + " (R$ " + produto1.preco + ")");
        System.out.println("Produto 2: " + produto2.nome + " (R$ " + produto2.preco + ")");
        System.out.println("Produto mais caro: " + maisCaro.nome);
    }
}

