package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = "Volkswagen";
        carro1.ano = 1974;

        Carro carro2 = new Carro();
        carro2.nome = "Civic";
        carro2.modelo = "Honda";
        carro2.ano = 2022;

        System.out.println("--- Carro 1 ---");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("\n--- Carro 2 ---");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}

