package exer.classes_metodos.dominio;

public class Promocao {
    public void aplicarDesconto(Produto produto, double porcentagem) {
        produto.preco = produto.aplicarDesconto(porcentagem);
    }
}

