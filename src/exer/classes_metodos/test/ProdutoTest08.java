package exer.classes_metodos.test;

import exer.classes_metodos.dominio.ImpressoraProduto;
import exer.classes_metodos.dominio.Produto;

public class ProdutoTest08 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Smartphone";
        produto1.preco = 2500.0;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Capa Protetora";
        produto2.preco = 40.0;
        produto2.quantidade = 50;

        ImpressoraProduto impressora = new ImpressoraProduto();

        System.out.println("--- Produto 1 ---");
        impressora.imprime(produto1);

        System.out.println("\n--- Produto 2 ---");
        impressora.imprime(produto2);
    }
}

