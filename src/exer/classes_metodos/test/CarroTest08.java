package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest08 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Renegade";
        carro.velocidadeAtual = 50.0;

        System.out.println("Carro: " + carro.nome);
        System.out.println("Velocidade inicial: " + carro.velocidadeAtual + " km/h");

        System.out.println("\nFreando 30.0 km/h...");
        carro.frear(30.0);
        System.out.println("Velocidade após primeira freada: " + carro.velocidadeAtual + " km/h");

        System.out.println("\nFreando 40.0 km/h (maior que a velocidade atual)...");
        carro.frear(40.0);
        System.out.println("Velocidade final (não pode ser menor que zero): " + carro.velocidadeAtual + " km/h");
    }
}

