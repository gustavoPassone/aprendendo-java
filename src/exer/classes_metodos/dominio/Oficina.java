package exer.classes_metodos.dominio;

public class Oficina {
    public void trocarVelocidades(Carro carro1, Carro carro2) {
        double temp = carro1.velocidadeAtual;
        carro1.velocidadeAtual = carro2.velocidadeAtual;
        carro2.velocidadeAtual = temp;
    }
}

