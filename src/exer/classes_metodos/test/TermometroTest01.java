package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Termometro;

public class TermometroTest01 {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 38.5;

        double temperaturaLimite = 37.5;
        boolean passou = termometro.passouDoLimite(temperaturaLimite);

        System.out.println("Temperatura Atual: " + termometro.temperaturaAtual + " °C");
        System.out.println("Temperatura Limite: " + temperaturaLimite + " °C");
        System.out.println("Passou do limite? " + passou);
    }
}

