package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest06 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.velocidadeAtual = 90.0;

        Carro carro2 = new Carro();
        carro2.nome = "Fit";
        carro2.velocidadeAtual = 55.0;

        int limiteDaVia = 70;
        System.out.println("Limite da via: " + limiteDaVia + " km/h");

        System.out.println("Carro 1 (" + carro1.nome + " - " + carro1.velocidadeAtual + " km/h):");
        carro1.imprimirMulta(limiteDaVia);

        System.out.println("Carro 2 (" + carro2.nome + " - " + carro2.velocidadeAtual + " km/h):");
        carro2.imprimirMulta(limiteDaVia);
    }
}

