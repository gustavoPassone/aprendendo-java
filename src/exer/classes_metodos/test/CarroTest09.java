package exer.classes_metodos.test;

import exer.classes_metodos.dominio.CadastroCarro;
import exer.classes_metodos.dominio.Carro;
import exer.classes_metodos.dominio.ImpressoraCarro;

public class CarroTest09 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Ferrari F8", "Tributo", 2022, 180.0);
        cadastro.cadastrar(carro2, "Porsche 911", "Carrera", 2023, 160.0);

        ImpressoraCarro impressora = new ImpressoraCarro();

        System.out.println("--- Carro 1 ---");
        impressora.imprime(carro1);

        System.out.println("\n--- Carro 2 ---");
        impressora.imprime(carro2);
    }
}

