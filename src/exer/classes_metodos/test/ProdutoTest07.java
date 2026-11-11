package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;

public class ProdutoTest07 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse Sem Fio";
        produto.preco = 80.0;
        produto.quantidade = 3;

        int quantidadeMinima = 5;
        boolean baixo = produto.estoqueBaixo(quantidadeMinima);

        System.out.println("Produto: " + produto.nome);
        System.out.println("Quantidade em estoque: " + produto.quantidade);
        System.out.println("Estoque mínimo exigido: " + quantidadeMinima);
        System.out.println("Estoque está baixo? " + baixo);
    }
}

