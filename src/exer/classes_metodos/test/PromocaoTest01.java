package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Produto;
import exer.classes_metodos.dominio.Promocao;

public class PromocaoTest01 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smart TV 55\"";
        produto.preco = 3000.0;
        produto.quantidade = 10;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Preço antes do desconto: R$ " + produto.preco);

        Promocao promocao = new Promocao();
        double porcentagem = 15;
        promocao.aplicarDesconto(produto, porcentagem);

        System.out.println("Desconto aplicado: " + porcentagem + "%");
        System.out.println("Preço depois do desconto: R$ " + produto.preco);
    }
}

