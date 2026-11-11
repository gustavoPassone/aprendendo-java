package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest07 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Golf GTI";
        carro.velocidadeAtual = 60.0;

        System.out.println("Carro: " + carro.nome);
        System.out.println("Velocidade antes: " + carro.velocidadeAtual + " km/h");

        double aceleracao = 45.0;
        System.out.println("Acelerando +" + aceleracao + " km/h...");
        carro.acelerar(aceleracao);

        System.out.println("Velocidade depois: " + carro.velocidadeAtual + " km/h");
    }
}

