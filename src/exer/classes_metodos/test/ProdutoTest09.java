package exer.classes_metodos.test;

import exer.classes_metodos.dominio.CadastroProduto;
import exer.classes_metodos.dominio.ImpressoraProduto;
import exer.classes_metodos.dominio.Produto;

public class ProdutoTest09 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(produto1, "Cadeira Gamer", 850.0, 5);
        cadastro.cadastrar(produto2, "Mesa de Escritório", 650.0, 8);

        ImpressoraProduto impressora = new ImpressoraProduto();

        System.out.println("--- Produto 1 ---");
        impressora.imprime(produto1);

        System.out.println("\n--- Produto 2 ---");
        impressora.imprime(produto2);
    }
}

