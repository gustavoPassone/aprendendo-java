package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;
import exer.classes_metodos.dominio.ImpressoraCarro;

public class CarroTest05 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Mustang";
        carro1.modelo = "Ford";
        carro1.ano = 2021;
        carro1.velocidadeAtual = 120.0;

        Carro carro2 = new Carro();
        carro2.nome = "Camaro";
        carro2.modelo = "Chevrolet";
        carro2.ano = 2020;
        carro2.velocidadeAtual = 110.0;

        ImpressoraCarro impressora = new ImpressoraCarro();

        System.out.println("--- Dados do Carro 1 ---");
        impressora.imprime(carro1);

        System.out.println("\n--- Dados do Carro 2 ---");
        impressora.imprime(carro2);
    }
}

