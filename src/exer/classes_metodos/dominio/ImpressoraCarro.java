package exer.classes_metodos.dominio;

public class ImpressoraCarro {
    public void imprime(Carro carro) {
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade Atual: " + carro.velocidadeAtual + " km/h");
    }

    public void imprimir(Carro carro, int limiteDaVia) {
        imprime(carro);
        System.out.println("Limite da via: " + limiteDaVia + " km/h");
        System.out.println("Status da multa: " + carro.gerarMensagemMulta(limiteDaVia));
    }

    public void imprime(Carro carro, int limiteDaVia) {
        imprimir(carro, limiteDaVia);
    }
}
