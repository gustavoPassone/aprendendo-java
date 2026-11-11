package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest04 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Corolla";
        carro.modelo = "Toyota";
        carro.ano = 2023;
        carro.velocidadeAtual = 95;

        int limiteDaVia = 80;
        String mensagem = carro.gerarMensagemMulta(limiteDaVia);

        System.out.println("Carro: " + carro.nome);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual + " km/h");
        System.out.println("Limite da via: " + limiteDaVia + " km/h");
        System.out.println("Status: " + mensagem);
    }
}

