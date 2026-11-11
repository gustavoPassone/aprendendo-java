package exer.classes_metodos.test;

import exer.classes_metodos.dominio.CadastroCarro;
import exer.classes_metodos.dominio.Carro;
import exer.classes_metodos.dominio.ImpressoraCarro;

public class SistemaCarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Civic Type R", "Honda", 2023, 110.0);
        cadastro.cadastrar(carro2, "Yaris", "Toyota", 2022, 60.0);

        ImpressoraCarro impressora = new ImpressoraCarro();
        int limiteDaVia = 80;

        System.out.println("=== SISTEMA DE MONITORAMENTO DE TRÂNSITO ===");
        System.out.println("\n--- Dados do Carro 1 ---");
        impressora.imprimir(carro1, limiteDaVia);

        System.out.println("\n--- Dados do Carro 2 ---");
        impressora.imprimir(carro2, limiteDaVia);
    }
}

