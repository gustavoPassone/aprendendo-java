package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;
import exer.classes_metodos.dominio.Oficina;

public class OficinaTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Lancer";
        carro1.velocidadeAtual = 140.0;

        Carro carro2 = new Carro();
        carro2.nome = "Subaru WRX";
        carro2.velocidadeAtual = 90.0;

        System.out.println("--- Velocidades Antes ---");
        System.out.println(carro1.nome + ": " + carro1.velocidadeAtual + " km/h");
        System.out.println(carro2.nome + ": " + carro2.velocidadeAtual + " km/h");

        Oficina oficina = new Oficina();
        oficina.trocarVelocidades(carro1, carro2);

        System.out.println("\n--- Velocidades Depois da Troca ---");
        System.out.println(carro1.nome + ": " + carro1.velocidadeAtual + " km/h");
        System.out.println(carro2.nome + ": " + carro2.velocidadeAtual + " km/h");
    }
}

