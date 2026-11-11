package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Teclado Mecânico";
        produto.preco = 250.0;
        produto.quantidade = 15;

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: R$ " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
    }
}

