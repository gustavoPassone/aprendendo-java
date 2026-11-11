package exer.classes_metodos.test;

import exer.classes_metodos.dominio.Animal;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nome = "Rex";
        animal1.especie = "Cachorro";
        animal1.idade = 5;

        Animal animal2 = new Animal();
        animal2.nome = "Mimi";
        animal2.especie = "Gato";
        animal2.idade = 3;

        System.out.println("--- Animal 1 ---");
        System.out.println("Nome: " + animal1.nome);
        System.out.println("Espécie: " + animal1.especie);
        System.out.println("Idade: " + animal1.idade + " anos");

        System.out.println("\n--- Animal 2 ---");
        System.out.println("Nome: " + animal2.nome);
        System.out.println("Espécie: " + animal2.especie);
        System.out.println("Idade: " + animal2.idade + " anos");
    }
}

