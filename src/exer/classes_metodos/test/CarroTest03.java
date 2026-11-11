package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest03 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "HB20";
        carro1.modelo = "Hyundai";
        carro1.ano = 2020;
        carro1.velocidadeAtual = 75;

        Carro carro2 = new Carro();
        carro2.nome = "Onix";
        carro2.modelo = "Chevrolet";
        carro2.ano = 2019;
        carro2.velocidadeAtual = 55;

        int limiteDaVia = 60;
        System.out.println("Limite da via: " + limiteDaVia + " km/h");
        System.out.println(carro1.nome + " (" + carro1.velocidadeAtual + " km/h) multado: " + carro1.isMultado(limiteDaVia));
        System.out.println(carro2.nome + " (" + carro2.velocidadeAtual + " km/h) multado: " + carro2.isMultado(limiteDaVia));
    }
}

