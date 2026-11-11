package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Gol";
        carro1.modelo = "Volkswagen";
        carro1.ano = 2005;

        Carro carro2 = new Carro();
        carro2.nome = "Corolla";
        carro2.modelo = "Toyota";
        carro2.ano = 2021;

        System.out.println(carro1.nome + " (" + carro1.ano + "): " + carro1.verificarIdadeDoCarro());
        System.out.println(carro2.nome + " (" + carro2.ano + "): " + carro2.verificarIdadeDoCarro());
    }
}

