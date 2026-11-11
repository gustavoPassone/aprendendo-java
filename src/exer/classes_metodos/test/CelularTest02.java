package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Celular;

public class CelularTest02 {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Apple";
        celular1.modelo = "iPhone 16 Pro";
        celular1.armazenamento = "256GB";
        celular1.preco = 8500.0;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "Moto G84";
        celular2.armazenamento = "256GB";
        celular2.preco = 1400.0;

        System.out.println(celular1.marca + " " + celular1.modelo + " (R$ " + celular1.preco + ") é premium? " + celular1.isPremium());
        System.out.println(celular2.marca + " " + celular2.modelo + " (R$ " + celular2.preco + ") é premium? " + celular2.isPremium());
    }
}

